import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = (br.readLine()).split("");
        int num = Integer.parseInt(br.readLine())-1;

        System.out.println(str[num]);
    }
}