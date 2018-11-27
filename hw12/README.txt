From Bloch's Item 76, we notice that by setting pEnd equal to the
MutablePeriod's end date, it's possible to modify pEnd so
that it changes the MutablePeriod's date.
This would be an issue if an attacker passes on an instance of the
MutablePeriod class to a class that depends, for security,
on a period's immutability. Serializable and deserializable classes,
which can be passed around, need to have defensive copying instead.
