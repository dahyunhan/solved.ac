import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int answer = 0;

        String n = scanner.nextLine();
        String nums = scanner.nextLine();

        String[] arr = nums.split("");

        for (int i = 0; i < Integer.parseInt(n); i++) {
            answer += Integer.parseInt(arr[i]);
        }

        System.out.println(answer);
    }
}