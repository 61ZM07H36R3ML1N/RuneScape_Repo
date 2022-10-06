package com.rs;

import com.rs.game.WorldTile;

public final class Settings {

    /* Server data configuration */
    public static int SERVER_PORT = 43594;
    public static int WORLD_ID = 1;
    public static final String SERVER_IP = "127.0.0.1";
    public static final String SERVER_NAME = "GodScape";
    public static final String FRAMEWORK_NAME = "GodScape";
    public static boolean MANAGMENT_SERVER_ENABLED = true;

    public static final int SERVER_VERSION = 1, SERVER_BUILD = 6;

    public static boolean SQUEAL_SERVICE = true;
    public static boolean SOLOMON_SERVICE = true;
    

    public static boolean DEV_MODE = true;

    /* Starter configuration */
    public static int[] STARTER_ITEMS = {386, 15273, 1725, 1540, 3842, 5698,
        4587, 1333, 1323, 1191, 1067, 1115, 1153, 995};
    public static final int START_PLAYER_HITPOINTS = 100;
    public static final WorldTile RESPAWN_PLAYER_LOCATION = new WorldTile(3164,3473, 0);

    /* Special game ranks */
    public static final String[] DEVELOPERS = {"fuzenseth", "nexon", gods angel", "your me",};
    public static final String[] MAIN_ACESSS = {"fuzenseth", "gods angel",};

    public static final WorldTile HOME = new WorldTile(3165,3459,0);
    /* Game configuration */
    public static final int AIR_GUITAR_MUSICS_COUNT = 50;
    public static final int QUESTS = 183;
    public static final int CHARM_RATE = 1;
    public static final int DROP_RATE = 1;
    public static boolean DICE_CHEAT;
    public static int[] deathKeepList = {6570, 23659, 10551, 20767, 20769,
        10548};
    /* Community configuration */
    public static final int NORMAL_LOYALTY_POINTS = 350;
    public static final int VIP_LOYALTY_POINTS = 700;
    public static boolean DOUBLE_EXPERIENCE = false;
    public static boolean DOUBLE_DROPS = false;
    public static boolean DOUBLE_VOTE_REWARDS = false;


    // All set using parameters on server launch
    public static boolean ECONOMY_MODE;
    public static boolean DEBUG;
    public static boolean SERVER_PUBLIC;

    // MySQL
    public static boolean USING_MYSQL_SERVICE = true;

    // Squeal Of Fortune
    public static boolean IS_SQUEAL_OF_FORTUNE_ENABLED = true;

    // XP configuration
    public static final double COMBAT_XP_RATE = 15, SKILLING_XP_RATE = 10,
            RUNECRAFTING_XP_RATE = 75;
    public static final double CRAFTING_XP_RATE = 50, FISHING_XP_RATE = 50,
            SUMMONING_XP_RATE = 35;

    // NPC Settings
    public static final int[] NON_WALKING_NPCS = {14620, 13955, 6892, 6539,
        1862, 1597, 557, 3820, 2759, 1918, 1783, 1167, 461, 683, 659, 568,
        598, 495, 553, 538, 540, 541, 548, 549, 552, 554, 576, 587, 2676};



    // MAX SELL PRICE
    public static final int MAX_SELL_RRICE = 100000000;
    public static final boolean XP_BONUS_ENABLED = false;

    // Disable or Enable Yell.
    public static boolean serverYell = true;
    public static String yellChangedBy;

    public static boolean yellEnabled() {
        return serverYell;
    }

    // Community Event
    public static String eventType;
    public static boolean eventActive;
    public static int communityEventX, communityEventY, communityEventP;

    // MISC
    public static boolean LENDING_DISABLED = false;
    public static int HOME_REGION_ID = 11827;

}
