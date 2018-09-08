package findPrimeFactor;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // return 2
        List<Integer> a = Arrays.asList(12, 25, 18, 8);
        List<Integer> b = Arrays.asList(6, 2, 3, 2);
        Integer result1 = FindPrimeFactor.findPrimeFactor(a, b);
        assert result1 == 2;
        System.out.println(result1);

        // return 1
        // 0 has infinite factors on for integers
        a = Arrays.asList(12, 0, 18, 8);
        b = Arrays.asList(6, 2, 3, 2);
        Integer result2 = FindPrimeFactor.findPrimeFactor(a, b);
        assert result2 == 1;
        System.out.println(result2);

        // return 1
        a = Arrays.asList(0, 0, 18, 8);
        b = Arrays.asList(6, 2, 3, 2);
        Integer result3 = FindPrimeFactor.findPrimeFactor(a, b);
        assert result3 == 1;
        System.out.println(result3);

        // return 1
        a = Arrays.asList(9, 10);
        b = Arrays.asList(null, 5);
        Integer result4 = FindPrimeFactor.findPrimeFactor(a, b);
        assert result4 == 1;
        System.out.println(result4);

        // return 1
        a = Arrays.asList(null, 10);
        b = Arrays.asList(null, 5);
        Integer result5 = FindPrimeFactor.findPrimeFactor(a, b);
        assert result5 == 1;
        System.out.println(result5);

        // null a returns NPE
        a = null;
        b = Arrays.asList(6, 2, 3, 2);
        try { Integer result6 = FindPrimeFactor.findPrimeFactor(a, b); }
        catch (NullPointerException e) {
            System.out.println("NPE for null a, as expected");
        }

        // null b returns NPE
        a = Arrays.asList(6, 2, 3, 2);
        b = null;
        try { Integer result7 = FindPrimeFactor.findPrimeFactor(a, b); }
        catch (NullPointerException e) {
            System.out.println("NPE for null b, as expected");
        }

    }

}