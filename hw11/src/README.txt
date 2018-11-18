
There is no problem with the equals method in the map implementation of
InstrumentedSet. The equals method in the Map interface calls entrySet() to
create a Set of itself and the Object, which then calls the Sets equals that
ends up calling Object's equals method. 
