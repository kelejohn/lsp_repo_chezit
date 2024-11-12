package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {

	 	@Test
	    @DisplayName("Test case for clear")
	    public void testClear() {
	        IntegerSet set = new IntegerSet();
	        set.add(1);
	        set.clear();
	        assertTrue(set.isEmpty(), "Set should be empty after clear");
	    }

	    @Test
	    @DisplayName("Test case for length")
	    public void testLength() {
	        IntegerSet set = new IntegerSet();
	        assertEquals(0, set.length(), "Length should be 0 for an empty set");
	        set.add(1);
	        assertEquals(1, set.length(), "Length should be 1 after adding one element");
	    }

	    @Test
	    @DisplayName("Test case for equals")
	    public void testEquals() {
	        IntegerSet set1 = new IntegerSet();
	        IntegerSet set2 = new IntegerSet();
	        set1.add(1);
	        set1.add(2);
	        set2.add(2);
	        set2.add(1);
	        assertTrue(set1.equals(set2), "Sets should be equal regardless of order");

	        set2.add(3);
	        assertFalse(set1.equals(set2), "Sets should not be equal if they contain different elements");
	    }

	    @Test
	    @DisplayName("Test case for contains")
	    public void testContains() {
	        IntegerSet set = new IntegerSet();
	        set.add(1);
	        assertTrue(set.contains(1), "Set should contain added element 1");
	        assertFalse(set.contains(2), "Set should not contain element 2 if it wasn't added");
	    }

	    @Test
	    @DisplayName("Test case for largest")
	    public void testLargest() throws IntegerSetException {
	        IntegerSet set = new IntegerSet();
	        set.add(1);
	        set.add(3);
	        set.add(2);
	        assertEquals(3, set.largest(), "Largest element should be 3");
	    }

	    @Test
	    @DisplayName("Test case for largest with exception")
	    public void testLargestException() {
	        IntegerSet set = new IntegerSet();
	        Exception exception = assertThrows(IntegerSetException.class, set::largest);
	        assertEquals("Set is empty", exception.getMessage());
	    }

	    @Test
	    @DisplayName("Test case for smallest")
	    public void testSmallest() throws IntegerSetException {
	        IntegerSet set = new IntegerSet();
	        set.add(1);
	        set.add(3);
	        set.add(2);
	        assertEquals(1, set.smallest(), "Smallest element should be 1");
	    }

	    @Test
	    @DisplayName("Test case for smallest with exception")
	    public void testSmallestException() {
	        IntegerSet set = new IntegerSet();
	        Exception exception = assertThrows(IntegerSetException.class, set::smallest);
	        assertEquals("Set is empty", exception.getMessage());
	    }

	    @Test
	    @DisplayName("Test case for add")
	    public void testAdd() {
	        IntegerSet set = new IntegerSet();
	        set.add(1);
	        set.add(1); // should not add again
	        assertEquals(1, set.length(), "Duplicate addition should not increase length");
	    }

	    @Test
	    @DisplayName("Test case for remove")
	    public void testRemove() {
	        IntegerSet set = new IntegerSet();
	        set.add(1);
	        set.remove(1);
	        assertFalse(set.contains(1), "Set should not contain removed element");
	    }

	    @Test
	    @DisplayName("Test case for union")
	    public void testUnion() {
	        IntegerSet set1 = new IntegerSet();
	        IntegerSet set2 = new IntegerSet();
	        set1.add(1);
	        set2.add(2);
	        set1.union(set2);
	        assertTrue(set1.contains(1) && set1.contains(2), "Union should contain all elements from both sets");
	    }

	    @Test
	    @DisplayName("Test case for intersect")
	    public void testIntersect() {
	        IntegerSet set1 = new IntegerSet();
	        IntegerSet set2 = new IntegerSet();
	        set1.add(1);
	        set1.add(2);
	        set2.add(2);
	        set2.add(3);
	        set1.intersect(set2);
	        assertTrue(set1.contains(2) && set1.length() == 1, "Intersection should only contain common elements");
	    }

	    @Test
	    @DisplayName("Test case for diff")
	    public void testDiff() {
	        IntegerSet set1 = new IntegerSet();
	        IntegerSet set2 = new IntegerSet();
	        set1.add(1);
	        set1.add(2);
	        set2.add(2);
	        set1.diff(set2);
	        assertTrue(set1.contains(1) && !set1.contains(2), "Difference should only contain elements in set1 but not in set2");
	    }

	    @Test
	    @DisplayName("Test case for complement")
	    public void testComplement() {
	        IntegerSet set1 = new IntegerSet();
	        IntegerSet set2 = new IntegerSet();
	        set1.add(1);
	        set2.add(2);
	        set1.complement(set2);
	        assertTrue(set1.contains(1) && set1.contains(2), "Complement should add all elements from set2 not in set1");
	    }

	    @Test
	    @DisplayName("Test case for isEmpty")
	    public void testIsEmpty() {
	        IntegerSet set = new IntegerSet();
	        assertTrue(set.isEmpty(), "Set should be empty initially");
	        set.add(1);
	        assertFalse(set.isEmpty(), "Set should not be empty after adding an element");
	    }

	    @Test
	    @DisplayName("Test case for toString")
	    public void testToString() {
	        IntegerSet set = new IntegerSet();
	        set.add(1);
	        set.add(2);
	        assertEquals("[1, 2]", set.toString(), "toString should return a formatted string representation of the set");
	    }

}
