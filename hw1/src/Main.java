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

        // return NPE
//        a = Arrays.asList(12, 25, null, 8);
//        b = Arrays.asList(6, 2, 3, 2);
//        System.out.println(FindPrimeFactor.findPrimeFactor(a, b));

    }
}
