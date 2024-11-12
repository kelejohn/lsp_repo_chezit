package org.howard.edu.lsp.assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * IntegerSet class that stores and manipulates a set of integers.
 */
public class IntegerSet  {
	// Store the set elements in an ArrayList.
	private List<Integer> set = new ArrayList<Integer>();

	/**
	 * Default constructor that initializes an empty set
	 */
	public IntegerSet() {
	}

	/**
     * Constructor to pass in an already initialized set.
     * 
     * @param set an ArrayList of integers to initialize the set
     */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	/**
     * Clears the internal representation of the set.
     */
	public void clear() {
		set.clear();
	}

	/**
     * Returns the number of elements in the set.
     * 
     * @return the size of the set
     */
	public int length() {
		return set.size();
	}; 

	/**
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.  
	 * 
     * @param o the object to compare
     * @return true if the sets are equal, false otherwise
	*/
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		IntegerSet intSet = (IntegerSet) o;
		return set.containsAll(intSet.set) && intSet.set.containsAll(set);
	}
	
	/**
     * Returns true if the set contains the specified value, otherwise false.
     * 
     * @param value the integer to check for in the set
     * @return true if the value is in the set, false otherwise
     */
	public boolean contains(int value) {
		return set.contains(value);
	}
	/**
     * Returns the largest value in the set.
     * 
     * @return the largest integer in the set
     */
	public int largest()  {
		return Collections.max(set);
	}
	
	/**
     * Returns the smallest value in the set.
     * 
     * @return the smallest integer in the set
     */
	public int smallest()  {
		return Collections.min(set);
	}
	
	/**
	 * Adds an item to the set. Does nothing if the item is already in the set.
	 * 
	 * @param item the integer to add to the set
	 */	
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}
	
	/**
	 * Adds an item to the set. Does nothing if the item is not already in the set.
	 * 
	 * @param item the integer to remove from the set
	 */
	public void remove(int item) {
		if (set.contains(item)) {
			set.remove(Integer.valueOf(item));
		}
	} 
	
	/**
     * Unites the current set with another set. The result is a set that contains
     * all elements from both sets without duplicates.
     * 
     * @param intSetb the second set to unite with
     */
	public void union(IntegerSet intSetb) {
		for (int item: intSetb.set) {
			this.add(item);
		}
	}
	
	/**
     * Modifies the current set to contain only the elements that are present in
     * both sets.
     * 
     * @param intSetb the second set to intersect with
     */
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}
	
	/**
     * Removes all elements from the current set that are present in the specified
     * set.
     * 
     * @param intSetb the second set whose elements are to be removed from the
     *                current set
     */
	public void diff(IntegerSet intSetb){
		set.removeAll(intSetb.set);
	}
	
	/**
     * Adds all elements from the second set to the current set if they are not
     * already present (complement).
     * 
     * @param intSetb the second set whose elements are added if not present in the
     *                current set
     */
	public void complement(IntegerSet intSetb) {
		for (int item : intSetb.set) {
			if (!this.set.contains(item)) {
				this.add(item);
			}
		}
	}
	
	/**
     * Returns true if the set is empty, otherwise false.
     * 
     * @return true if the set is empty, false otherwise
     */
	boolean isEmpty() {
		return set.isEmpty();
	}
	
	/**
     * Returns a string representation of the set.
     * 
     * @return a string representing the elements in the set
     */
	public String toString() {
		return set.toString();
	}
	}
