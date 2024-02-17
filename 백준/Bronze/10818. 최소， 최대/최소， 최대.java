import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String stringCnt = br.readLine();
        String[] stringArr = br.readLine().split(" ");
        int cnt = Integer.parseInt(stringCnt);
        int[] arr = new int[cnt];
        // Comparator<String> comparator = Comparator.comparingInt(Integer::parseInt);
        // Arrays.sort(arr, comparator);

        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);

        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[cnt - 1]);
    }
}