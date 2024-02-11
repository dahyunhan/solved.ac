import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        StringBuilder str = new StringBuilder();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < a + 1; i++) {
            String[] arr = scanner.nextLine().split(" ");
            switch (arr[0]) {
                case "push":
                    stack.add(arr[1]);
                    break;
                case "pop":
                    if (stack.size() == 0) {
                        str.append("-1\n");
                    } else
                        str.append(stack.pop() + "\n");
                    break;
                case "size":
                    str.append(stack.size() + "\n");
                    break;
                case "empty":
                    if (stack.empty() == true) {
                        str.append("1\n");
                    } else
                        str.append("0\n");
                    break;
                case "top":
                    if (stack.size() == 0) {
                        str.append("-1\n");
                    } else
                        str.append(stack.peek() + "\n");
                    break;
                default:
                    break;
            }

        }
        System.out.println(str);

    }
}