import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {

            String[] arr = (br.readLine()).split(" ");

            int cnt2 = Integer.parseInt(arr[0]);
            String[] arr2 = arr[1].split("");

            for (int j = 0; j <  arr2.length; j++) {
                for (int k = 0; k <cnt2; k++) {
                    stringBuilder.append(arr2[j]);
                }

                if (j == arr2.length - 1) {
                    stringBuilder.append("\n");
                    break;
                }
            }
        }
        System.out.println(stringBuilder);

    }
}