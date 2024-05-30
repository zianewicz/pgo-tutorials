import java.math.BigDecimal;
import java.util.List;

public class Multiplier {

    // a) Metoda przyjmująca dwie zmienne typu int
    public int multiply(int a, int b) {
        return a * b;
    }

    // b) Metoda przyjmująca cztery zmienne typu int
    public int multiply(int a, int b, int c, int d) {
        // Wywołanie metody przyjmującej dwa parametry
        return multiply(multiply(a, b), multiply(c, d));
    }

    // c) Metoda przyjmująca dwie zmienne typu double
    public double multiply(double a, double b) {
        return a * b;
    }

    // d) Metoda przyjmująca dwa obiekty typu BigDecimal
    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    // e) Metoda przyjmująca listę obiektów klasy Integer
    public int multiply(List<Integer> integers) {
        int result = 1;
        for (int number : integers) {
            result *= number;
        }
        return result;
    }
}
