import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());

        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));

    }
}