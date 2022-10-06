package com.rs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.alex.store.Index;
import com.rs.cache.Cache;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.ItemsEquipIds;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.cores.CoresManager;
import com.rs.game.Region;
import com.rs.game.RegionBuilder;
import com.rs.game.World;
import com.rs.game.npc.combat.CombatScriptsHandler;
import com.rs.game.player.LendingManager;
import com.rs.game.player.Player;
import com.rs.game.player.content.FishingSpotsHandler;
import com.rs.game.player.content.FriendChatsManager;
import com.rs.game.player.content.clans.ClansManager;
import com.rs.game.player.content.daily_challenges.DailyChallengesManager;
import com.rs.game.player.content.grandexchange.GrandExchange;
import com.rs.game.player.content.grandexchange.GrandExchangePriceLoader;
import com.rs.game.player.content.grandexchange.Offer;
import com.rs.game.player.content.grandexchange.Offers;
import com.rs.game.player.content.grandexchange.tradeAbleItems;
import com.rs.game.player.controllers.ControllerHandler;
import com.rs.game.player.cutscenes.CutscenesHandler;
import com.rs.game.player.dialogue.DialogueHandler;
import com.rs.game.worldlist.WorldList;
import com.rs.network.ServerChannelHandler;
import com.rs.utils.AutoBackup;
import com.rs.utils.DTRank;
import com.rs.utils.DisplayNames;
import com.rs.utils.IPBanL;
import com.rs.utils.IPMute;
import com.rs.utils.ItemBonuses;
import com.rs.utils.ItemExamines;
import com.rs.utils.ItemWeights;
import com.rs.utils.Logger;
import com.rs.utils.MACBan;
import com.rs.utils.MapArchiveKeys;
import com.rs.utils.MapAreas;
import com.rs.utils.MusicHints;
import com.rs.utils.NPCBonuses;
import com.rs.utils.NPCCombatDefinitionsL;
import com.rs.utils.NPCDrops;
import com.rs.utils.NPCExamines;
import com.rs.utils.NPCSpawning;
import com.rs.utils.NPCSpawns;
import com.rs.utils.ObjectSpawns;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;
import com.rs.utils.huffman.Huffman;

public final class ServerLauncher {

    public static void main(String[] args) throws Exception {
        init();
    }

    public static void init() throws IOException {
        long launchTime = Utils.currentTimeMillis();

        /* Lets launch everything */
        Logger.log("ServerLauncher", "Initing Server...");

        /* Initialize characters auto-backup */
        AutoBackup.init();
        Logger.log("Preparing Auto-Backup...");

        /* Initialize cache */
        Cache.init();
        ItemsEquipIds.init();

        Huffman.init();
        Logger.log("Preparing Cache...");

        /* Initialize player data */
        DisplayNames.init();
        IPBanL.init();
        MACBan.init();
        IPMute.init();
        Logger.log("Preparing Player Data...");

        /* Mapdata */
        MapArchiveKeys.init();
        MapAreas.init();
        ObjectSpawns.init();
        Logger.log("Preparing Mapdata...");

        /* Initialize non-player-character data */
        NPCSpawns.init();
        NPCCombatDefinitionsL.init();
        NPCBonuses.init();
        NPCDrops.init();
        NPCExamines.init();
        CombatScriptsHandler.init();
        FishingSpotsHandler.init();
        Logger.log("Preparing NPC Data...");

        /* Initialize item data */
        ItemExamines.init();
        ItemWeights.init();
        ItemBonuses.init();
        tradeAbleItems.initialize();
        Logger.log("Preparing Item Data...");

        /* Initlizes music hints */
        MusicHints.init();
        Logger.log("Preparing Music Hints...");

        /* Initlizes shops data */
        ShopsHandler.init();
        Logger.log("Preparing Shops Handler...");

        /* Initlizes lobby world data */
        WorldList.init();
        Logger.log("Preparing Lobby...");

        /* Initlizes clans manager */
        Logger.log("Preparing Clans Manager...");
        ClansManager.init();

        DialogueHandler.init();
        ControllerHandler.init();
        CutscenesHandler.init();
        FriendChatsManager.init();
        Logger.log("Preparing In-Game Scripts...");
        Logger.log("Preparing Login Server Connection...");
        GrandExchangePriceLoader.initialize();
        Offers.load();
        Logger.log("Preparing Grand Exchange...");

        /* World thread */
        CoresManager.init();
        World.init();
        Logger.log("Preparing World Engine...");

        /* Region Builder */
        RegionBuilder.init();
        Logger.log("Preparing Region Builder...");

        /* Networking */
        ServerChannelHandler.init();
        Logger.log("Preparing Netty...");

        /* Lending Manager */
        LendingManager.init();
        Logger.log("Preparing Lending Manager...");

        /* Add tasks */
        addAccountsSavingTask();
        addCleanMemoryTask();
        addGrandExchangeSaveTask();
        loadDefaultExchanges();

        NPCSpawning.spawnNPCS();
        DailyChallengesManager.load();
        /* Server launched */
        Logger.log("Server launched with port " + Settings.SERVER_PORT + " in "
                + (Utils.currentTimeMillis() - launchTime) + " MILLISECONDS.");
    }

    private static void loadDefaultExchanges() {
        for (int i = 0; i < 20_000; i++) {
            final Offer offer;
            if (ItemDefinitions.getItemDefinitions(i).getPrice() > 0 && ItemDefinitions.getItemDefinitions(i) != null) {
            
                    offer = new Offer(0, i,
                            Integer.MAX_VALUE - 2000, 0, 0, ItemDefinitions.getItemDefinitions(i).getPrice(), 0, "Ivory Bot", false,
                            -1);
                    Offers.offers.add(offer);
                }
            
        }
    }

    private static void addAccountsSavingTask() {
        CoresManager.slowExecutor.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    saveFiles();
                } catch (Throwable e) {
                    Logger.handle(e);
                }
            }
        }, 10, 10, TimeUnit.MINUTES); // 15, 15
    }

    private static void addGrandExchangeSaveTask() {
        CoresManager.slowExecutor.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    Offers.saveOffers();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }, 30, 30, TimeUnit.SECONDS);
    }

    private static void addCleanMemoryTask() {
        CoresManager.slowExecutor.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    cleanMemory(Runtime.getRuntime().freeMemory() < DataConstant.MINIMUM_RAM_ALLOCATED);
                } catch (Throwable e) {
                    Logger.handle(e);
                }
            }
        }, 0, 10, TimeUnit.MINUTES);
    }

    public static void cleanMemory(boolean force) {
        if (force) {
            ItemDefinitions.clearItemsDefinitions();
            NPCDefinitions.clearNPCDefinitions();
            ObjectDefinitions.clearObjectDefinitions();
            for (Region region : World.getRegions().values()) {
                region.removeMapFromMemory();
            }
        }
        for (Index index : Cache.STORE.getIndexes()) {
            index.resetCachedFiles();
        }
        CoresManager.fastExecutor.purge();
        System.gc();
    }

    public static void closeServices() {
        ServerChannelHandler.shutdown();
        CoresManager.shutdown();
    }

    public static void saveFiles() throws Exception {
        for (Player player : World.getPlayers()) {
            if (player == null || !player.isActive() || player.hasFinished()) {
                continue;
            }
            SerializableFilesManager.savePlayer(player);
        }
        DisplayNames.save();
        Offers.saveOffers();
        IPBanL.save();
        IPMute.save();
        MACBan.save();
        DTRank.save();
    }

    public static void shutdown() {
        try {
            closeServices();
        } finally {
            System.exit(0);
        }
    }

    private ServerLauncher() {

    }
}
