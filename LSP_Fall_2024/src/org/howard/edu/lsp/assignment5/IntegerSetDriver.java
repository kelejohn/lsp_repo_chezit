package org.howard.edu.lsp.assignment5;

/**
 * This class contains the main method to test the functionality of the IntegerSet class.
 * It tests various set operations such as add, remove, union, intersection, difference,
 * complement, equality, checking for emptiness, and finding the length of the set.
 * Each operation displays the content of the sets before and after the operation.
 */
public class IntegerSetDriver{
	   /**
	   * The main method to run the test cases for IntegerSet.
	   * It creates instances of IntegerSet, performs operations, and prints results to the console.
	   *
	   * @param args command-line arguments 
	   */
	public static void main(String[] args) {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Smallest value in Set1 is: " + set1.smallest());
		System.out.println("Largest value in Set1 is: " + set1.largest());
		System.out.println("Set1 contains 2: " + set1.contains(2));  // true
        System.out.println("Set1 contains 5: " + set1.contains(5));  // false
        
        set1.remove(2);
        System.out.println("Value of Set1 after removing 2 is: " + set1.toString());
        
        // Test case 3: Add duplicate element (should not add again)
        
        set1.add(1);
        System.out.println("Value of Set1 after trying to add 1 again: " + set1.toString());
        
        set1.add(2);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		// union test case
		System.out.println();
		
		System.out.println("Union of Set1 and Set2:");
		System.out.println("Value of Set1 is: " + set1.toString());  // Before union
		System.out.println("Value of Set2 is: " + set2.toString());  // Before union

		set1.union(set2);  // union of set1 and set2
		
		System.out.println("Result of union of Set1 and Set2:");
		System.out.println("Value of Set1 is: " + set1.toString());  // After union
		
		// intersection test case
		System.out.println();
		
		set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
		System.out.println("Intersection of Set1 and Set2:");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        
        set1.intersect(set2);
        
        System.out.println("Result of intersection of Set1 and Set2:");
		System.out.println("Value of Set1 is: " + set1.toString());  // After intersection
		
		// difference test case
		System.out.println();
		
        set1.add(1);
        set1.add(2);
        
		System.out.println("Difference of Set1 and Set2:");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        
        set1.diff(set2);
        
        System.out.println("Result of difference of Set1 and Set2:");
		System.out.println("Value of Set1 is: " + set1.toString()); // After difference (set1 - set2)
		
		// complement test case
		System.out.println();
		
        set1.clear();
        set1.add(1);
        set1.add(2);
        
        set2.clear();
        set2.add(3);
        set2.add(4);
        
        System.out.println("Complement of Set1 and Set2:");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        
        set1.complement(set2);
        
        System.out.println("Result of complement of Set1 and Set2:");
		System.out.println("Value of Set1 is: " + set1.toString()); // After complement
		
		// equals test case
		System.out.println();
		
        set2.clear();
        set2.add(3);
        set2.add(2);
        set2.add(1);
        
        System.out.println("Set1 equals Set2:");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        
        System.out.println("Result of Set1 equals Set2: " + set1.equals(set2));  // false
        
        set1.remove(4);
        System.out.println("Result of Set1 equals Set2 (after removing 4 from Set1): " + set1.equals(set2)); //true
        
        // is empty test case
        System.out.println();
        System.out.println("Is Set1 empty:");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Result of Set1 is empty: " + set1.isEmpty());  // false
        set1.clear();
        System.out.println("Result of Set1 is empty (after clear): " + set1.isEmpty());  // true

        // length of the set test case
        System.out.println();
        System.out.println("Length of Set2:");
        System.out.println("Value of Set2 is: " + set2.toString());
        System.out.println("Length of Set1: " + set2.length());  // 3
	}
}
