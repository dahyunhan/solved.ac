import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        while (true) {
            String str = br.readLine();

            if (str.equals(".")) {
                break;

            } else {
                stack.clear();
                for (int i = 0; i < str.length(); i++) {

                    if (str.charAt(i) == '(') {
                        stack.push(1);
                    }

                    if (str.charAt(i) == '[') {
                        stack.push(2);
                    }

                    if (str.charAt(i) == ')') {
                        if (!stack.empty()&&stack.peek() == 1) {
                            stack.pop();
                        } else {

                            stack.push(3);
                        }

                    }
                    if (str.charAt(i) == ']') {
                        if (!stack.empty()&&stack.peek() == 2) {
                            stack.pop();
                        } else  {


                            stack.push(3);
                        }

                    }

                }
                if ((stack.size() != 0)) {
                    stringBuilder.append("no\n");

                } else {
                    stringBuilder.append("yes\n");

                }


            }
        }

        System.out.println(stringBuilder);
    }
}