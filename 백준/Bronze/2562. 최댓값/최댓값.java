import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = 0;
        int cnt = 0;

        for (int i = 0; i < 9; i++) {

            int num = Integer.parseInt(br.readLine());
            arrayList.add(num);
            if (max < num) {
                max = num;
            } else {
                continue;
            }

            if (arrayList.get(i) == max) {
                cnt = i;
            }
        }
        System.out.println(max + "\n" + (cnt + 1));
    }
}