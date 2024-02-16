import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            try {
                String[] arr = str.split(" ");
                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[1]);
                sb.append(a + b + "\n");
            } catch (Exception e) {
                break;
            }
        }

        System.out.println(sb);
    }
}