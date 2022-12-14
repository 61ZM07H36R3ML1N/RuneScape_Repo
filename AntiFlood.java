package com.rs.utils;

import java.util.ArrayList;

/**
 * Anti Flood
 * 
 * @Author Apache Ah64
 */
public final class AntiFlood {

    private static ArrayList<String> connections = new ArrayList<String>(3);

    public static void add(String ip) {
	connections.add(ip);
    }

    public static int getSessionsIP(String ip) {
	int amount = 1;
	for (int i = 0; i < connections.size(); i++) {
	    if (connections.get(i).equalsIgnoreCase(ip))
		amount++;
	}
	return amount;
    }

    public static void remove(String ip) {
	connections.remove(ip);
    }
}