import java.math.BigDecimal;
import java.util.Arrays;

public class Testowanie {
    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();

        // Testowanie metody multiply dla int
        System.out.println("2 * 3 = " + multiplier.multiply(2, 3));

        // Testowanie metody multiply dla czterech int
        System.out.println("2 * 3 * 4 * 5 = " + multiplier.multiply(2, 3, 4, 5));

        // Testowanie metody multiply dla double
        System.out.println("2.5 * 3.5 = " + multiplier.multiply(2.5, 3.5));

        // Testowanie metody multiply dla BigDecimal
        BigDecimal bd1 = new BigDecimal("2.5");
        BigDecimal bd2 = new BigDecimal("3.5");
        System.out.println("2.5 * 3.5 (BigDecimal) = " + multiplier.multiply(bd1, bd2));

        // Testowanie metody multiply dla listy Integer
        System.out.println("Product of [2, 3, 4] = " + multiplier.multiply(Arrays.asList(2, 3, 4)));
    }
}
