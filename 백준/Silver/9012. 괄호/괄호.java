import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < a; i++) {

            String str = scanner.next();
            Stack<String> stack = new Stack<>();
            int len = str.length();
            for (int j = 0; j < len; j++) {
                if (str.charAt(j) == '(') {
                    stack.push("*");
                } else if (str.charAt(j) == ')') {
                    if (stack.size() == 0) {
                        stack.push("*");
                        break;
                    } else
                        stack.pop();
                }

            }
            if (stack.size() != 0) {
                answer.append("NO\n");
            } else
                answer.append("YES\n");

        }
        System.out.println(answer);

    }
}