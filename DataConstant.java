package com.rs;

public final class DataConstant {

    /* Server management */
    public static final int REVISION = 742; // revision of the client
    public static final int SUB_REVISION = 2; // client build
    public static final int MINIMUM_RAM_ALLOCATED = 100000000; // 100 megabyte
    public static final int WORLD_CYCLE_TIME = 600; // recycle 600 milliseconds

    /* Data location file */
    public static final String CACHE_PATH = "data/cache/";
    public static final String LOGS_PATH = "data/playersaves/logs/";

    /* Server limits */
    public static final int SV_RECEIVE_DATA_LIMIT = 10000; // bytes
    public static final int SV_PACKET_SIZE_LIMIT = 10000; // bytes
    public static final long SV_MAX_PACKETS_DECODER_PING_DELAY = 30000; // 30
									// seconds
    public static final int SV_PLAYERS_LIMIT = 1000;
    public static final int SV_LOCAL_PLAYERS_LIMIT = 250;
    public static final int SV_NPCS_LIMIT = Short.MAX_VALUE;
    public static final int SV_LOCAL_NPCS_LIMIT = 250;

    // MAX SESSIONS
    public static int MAX_CONNECTED_SESSIONS_PER_IP = 3;

    /* Map configuration size */
    public static final int[] MAP_SIZES = { 104, 120, 136, 168, 72 };

    // CLIENT TOKEN -1
    public static final String GRAB_SERVER_TOKEN = "MpanIDx68ZShS/0wQc60lSvsuEhgYKEW";

    // WHAT IS RSA YEAH LETS NOT USE IT SO OUR SERVER IS NOT SECURE!

}