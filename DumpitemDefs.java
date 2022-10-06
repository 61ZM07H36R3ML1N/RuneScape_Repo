package com.rs.tools;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.rs.cache.Cache;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.utils.Utils;

public class DumpitemDefs {

    public static final void main(String[] args) throws IOException {
	Cache.init();
	String location = "ItemList.txt";
	System.out.println("Starting dumping ItemDefinitons at " + location);
	for (int itemId = 0; itemId < Utils.getItemDefinitionsSize(); itemId++) {
	    try {
		BufferedWriter writer = new BufferedWriter(new FileWriter(
			location, true));
		writer.write(ItemDefinitions.getItemDefinitions(itemId).getId()
			+ " - " + ""
			+ ItemDefinitions.getItemDefinitions(itemId).getName()
			+ "");
		writer.newLine();
		writer.flush();
		writer.close();
		if (ItemDefinitions.getItemDefinitions(itemId).getId() == Utils
			.getItemDefinitionsSize() - 1)
		    System.out.println("Finished "
			    + Utils.getItemDefinitionsSize() + " items.");
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	}
    }
}
