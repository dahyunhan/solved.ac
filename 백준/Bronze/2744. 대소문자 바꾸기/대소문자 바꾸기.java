import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 96 && arr[i] < 123) {
                arr[i] = Character.toUpperCase(arr[i]);
            } else if (arr[i] > 64 && arr[i] < 91) {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }

        System.out.println(arr);

    }
}