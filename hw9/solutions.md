SWE 619 Assignment 9, Fall 2018


1. It is possible to get to a state where _started_ holds, but _ready_ does not hold.
EF(started && !ready)


2. For any state, if a _request_ (of some resource) occurs, then it will eventually be _acknowledged_.
AG(requested -> AF(acknowledged))

3. A certain process is _enabled_ infinitely often on every computation path.
AF(enabled) or AG(AF(enabled))

4. Whatever happens, a certain process will eventually be permanently _deadlocked_.
AF(AG(deadlocked))

5. From any state, it is possible to get to a _restart_ state.
AG(EF(restart))

6. An upwards traveling elevator at the second floor does not change its direction when it has passengers wishing to go to the fifth floor. 
Use predicates such as _direction == up_, _floor == 2_, and _Button5Pressed_.
AG((floor=2 && direction=up && Button5Pressed) -> A[direction=up U floor=5])
Not needed for HW.

7. The elevator can remain idle on the third floor with its doors closed.
EG(floor=3 && state=idle && doors=closed)

8. After _switchClosed_ becomes true, _valueOpen_ is never true.
switchClosed -> AX(AG(!valueOpen))

9. After _q_, _p_ is not true until _r_.
Not needed for HW.

10. Variable _toggle_ varies between true and false on successive states.
AG((toggle -> AX(!toggle) && (!toggle -> AX(toggle))