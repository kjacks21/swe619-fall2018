For homework 13 we converted our homework 10 IntSet test cases to use
theories. In doing so, we added an array of IntSets to be used as the
DataPoints. See IntSetTheoryTest.java.

To convert the testEquals, testClone, and testHashCode methods, we added
an IntSet parameter and an assumption that the parameter cannot be null.
