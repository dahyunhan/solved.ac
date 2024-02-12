import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double answer = 0;
        int max = 0;

        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String grade = scanner.nextLine();

        String[] arr = grade.split(" ");

        for (int i = 0; i < Integer.parseInt(n); i++) {

            if (max < Integer.parseInt(arr[i])) {
                max = Integer.parseInt(arr[i]);

            }
            answer += Integer.parseInt(arr[i]);

        }
        System.out.println(answer * 100 / max / Integer.parseInt(n));
    }
}