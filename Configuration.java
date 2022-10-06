package com.rs;

/**
 * 
 * @author Fuzen Seth
 * @information This file holds game configurations.
 */
public class Configuration {
    /***
     * Can the player directly login without tutorial coming up?
     */
    public static final boolean INSTANT_START = true;
    /**
     * The welcome mesasge.
     */
    public static final String WELCOME_MESSAGE = "Welcome to GodScape.";
    /**
     * Player moderators.
     */
    public static final String[] PLAYER_MODERATORS = { "nobody" };
    /**
     * The developers.
     */
    public static final String[] DEVELOPERS = { "fuzenseth", "nexon",
	    "pink asian" };
    /**
     * The NPCs who cannot face to player upon interact.
     */
    public static final String[] INVALID_FACING_NPCS = { "musician" };
}
