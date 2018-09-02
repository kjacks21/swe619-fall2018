import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // return 2
        List<Integer> a = Arrays.asList(12, 25, 18, 8);
        List<Integer> b = Arrays.asList(6, 2, 3, 2);
        System.out.println(FindPrimeFactor.findPrimeFactor(a, b));

        // return 2
        List<Integer> a = Arrays.asList(12, 25, 18, 8);
        List<Integer> b = Arrays.asList(6, 2, 3, 2);
        System.out.println(FindPrimeFactor.findPrimeFactor(a, b));

        // return NPE
        a = Arrays.asList(12, 25, null, 8);
        b = Arrays.asList(6, 2, 3, 2);
        System.out.println(FindPrimeFactor.findPrimeFactor(a, b));

    }
}
