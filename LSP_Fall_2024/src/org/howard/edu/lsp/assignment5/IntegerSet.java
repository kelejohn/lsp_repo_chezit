package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSet  {
	// Store the set elements in an ArrayList.
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {
	}

	// Constructor if you want to pass in already initialized
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	// Clears the internal representation of the set.
	public void clear() {
		set.clear();
	}

	// Returns the length of the set. 
	public int length() {
		return set.size();
	}; 

	/*
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
	 * the equal method from the Object class. 10 pts.
	*/
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		IntegerSet intSet = (IntegerSet) o;
		return set.containsAll(intSet.set) && intSet.set.containsAll(set);
	}
	
	// Returns true if the set contains the value, otherwise false. 5 pts.
	public boolean contains(int value) {
		return set.contains(value);
	}
	
	// Returns the largest item in the set. 5 pts.
	public int largest()  {
		return Collections.max(set);
	}
	
	// Returns the smallest item in the set. 5 pts.
	public int smallest()  {
		return Collections.min(set);
	}
	
	// Adds an item to the set or does nothing it already there. 5 pts.	
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}
	
	// Removes an item from the set or does nothing if not there. 5 pts.
	public void remove(int item) {
		if (!set.contains(item)) {
			set.remove(item);
		}
	} 
	
	// Set union. 11 pts.
	public void union(IntegerSet intSetb) {
		for (int item: intSetb.set) {
			this.add(item);
		}
	}
	
	// Set intersection, all elements in s1 and s2. 12 pts.
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}
	
	// Set difference, i.e., s1 –s2. 12 pts.
	public void diff(IntegerSet intSetb){
		set.removeAll(intSetb.set);
	}
	
	// Set complement, all elements not in s1. 11 pts.
	public void complement(IntegerSet intSetb) {
		for (int item : intSetb.set) {
			if (!this.set.contains(item)) {
				this.add(item);
			}
		}
	}
	
	// Returns true if the set is empty, false otherwise. 5 pts.
	boolean isEmpty() {
		return set.isEmpty();
	}
	
	// Return String representation of your set.  This overrides the equal method from 
	// the Object class. 5 pts.
	public String toString() {
		return set.toString();
	}
	}
