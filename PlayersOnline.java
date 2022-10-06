package com.rs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Players online
 * 
 * @author Anthony
 */

public class PlayersOnline {

    private static PlayersOnline instance = new PlayersOnline();

    public static PlayersOnline getInstance() {
	return instance;
    }

    private List<String> onlines = Collections
	    .synchronizedList(new ArrayList<String>());

    public void update(List<String> onlines) {
	this.onlines = onlines;
    }

    public List<String> getOnlines() {
	return onlines;
    }

    public int getCount() {
	return onlines.size();
    }

}