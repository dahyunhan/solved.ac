import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = (br.readLine().split(" "));
        String[] arr = (br.readLine().split(" "));

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[] s = new int[arr.length + 1];
        s[0] = 0;

        StringBuilder stringBuilder = new StringBuilder();

        for (int k = 1; k <= n; k++) {
            s[k] = s[k - 1] + Integer.parseInt(arr[k - 1]);

        }

        for (int h = 0; h < m; h++) {

            String[] ij = br.readLine().split(" ");

            int i = Integer.parseInt(ij[0]);
            int j = Integer.parseInt(ij[1]);

            stringBuilder.append((s[j]) - (s[i - 1]) + "\n");
        }

        System.out.println(stringBuilder);

    }
}