import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int day = Integer.parseInt(arr[0]);
        int night = Integer.parseInt(arr[1]);
        int m = Integer.parseInt(arr[2]);

        // 전날: (day - night) * count;
        // 낮: (day - night) * (count - 1) + day > m

        int answer = ((m - day) / (day - night)) + 1;

        if((day - night) * (answer - 1) + day >= m) {
            System.out.println(answer);
        } else {
            System.out.println(answer + 1);
        }
    }
}