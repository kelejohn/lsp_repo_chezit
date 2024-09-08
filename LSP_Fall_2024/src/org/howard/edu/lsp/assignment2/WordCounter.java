package org.howard.edu.lsp.assignment2;

import java.util.*;
import java.io.*;

public class WordCounter {

	public static void main(String[] args) throws FileNotFoundException {
		HashMap<String,Integer>countMap= new HashMap<>();
		
		File file = new File("src/org/howard/edu/lsp/assignment2/words.txt");
		Scanner scanner = new Scanner(file);
			
		while (scanner.hasNext()) {
			String current = scanner.next().replaceAll("\\W+", "").toLowerCase();
			if (current.length() > 3) {
				countMap.put(current, countMap.getOrDefault(current, 0) + 1);
				}
			}
			
		for (Map.Entry<String, Integer> entry: countMap.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
			}
		}

	}

