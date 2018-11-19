Using the Collection interface instead of Set makes it such that equals() no longer
satisfies the contract since, referring to the tests in InstrumentedTest.java, equals()
compares the Collection s, which is a HashSet, in ForwardingCollection to an
InstrumentedCollection object instance. The tests show that equals() fails reflexivity and
symmetry when we replace the Set interface with Collection.

There is no problem with the equals method in the map implementation of
InstrumentedSet. The equals method in the Map interface calls the objects
entrySet method as well as its own. This method creates a Set of the mappings
for each. It then calls equals on those two Sets. It wouldn't matter if the object 
is a Hashmap or a Treemap, because of the creation of the two Sets.
