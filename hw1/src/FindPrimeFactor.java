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


        for (int i = 0; i <= b.size(); i++) {
            // check if either element is null
            if (a.get(i) == null || b.get(i) == null) {
                // do nothing
            }

            else if (isPrime(b.get(i)) && a.get(i) % b.get(i) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPrime (int n) {
        // values less than 2 are not prime
        if (n < 2) {
            return false;
        }

        // check integers less than or equal to the sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
