import java.util.List;

public class FindPrimeFactor {

    public static int findPrimeFactor (List<Integer> a, List<Integer> b) {
        // Requires: a not null; b not null;
        //           there is some index i where b[i] is
        //           both prime and a factor of a[i]
        //
        // Effects: return the least index
        //          at which b[i] is a prime factor of a[i]
        // E.g. findPrimeFactor ([12, 25, 18, 8], [6, 2, 3, 2]) = 2
        // (Note: 6 is a factor of 12, but is not prime,
        //  and 2 is prime, but is not a factor of 25.  However,
        //  3 is a prime factor of 18. Hence, index "2" is the correct
        //  answer.  index "3" is not a possible answer, because the
        //  third index is not the least index with the desired property.)
        // Also note that a[] and b[] need not be of the same length.
        if (a.isEmpty()) {
            return -1;
        }
        return 0;
    }

}
