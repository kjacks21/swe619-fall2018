Using the Collection interface instead of Set makes it such that equals() no longer
satisfies the contract since, referring to the tests in InstrumentedTest.java, equals()
compares the Collection s, which is a HashSet, in ForwardingCollection to an
InstrumentedCollection object instance. The tests show that equals() fails reflexivity and
symmetry when we replace the Set interface with Collection.

There is no problem with the equals method in the map implementation of
InstrumentedSet. The equals method in the Map interface calls entrySet() to
create a Set of itself and the Object, which then calls the Sets equals that
ends up calling Object's equals method. 
