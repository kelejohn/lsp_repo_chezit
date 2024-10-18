package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * This method returns the number of common key-value pairs between two HashMaps.
 * If either or both maps are empty, it returns 0.
 *
 * @param map1 : the first HashMap
 * @param map2 : the second HashMap
 * @return the number of common key-value pairs
 */
public class MapUtilities {
	
	public static int commonKeyValuePairs(
	        HashMap<String, String> map1,
	        HashMap<String, String> map2){
		if (map1.isEmpty() || map2.isEmpty()) {
			return 0;
		}
		int common = 0;
		for (String key : map1.keySet()) {
            // Check if map2 contains the same key and value
            if (map2.containsKey(key) && map2.get(key).equals(map1.get(key))) {
                common++;
            }
        }

        return common;

	    }
}
