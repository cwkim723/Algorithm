import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String total = br.readLine();
        String count = br.readLine();
        int sum = 0;
        for(int i = 0; i < Integer.parseInt(count); i++) {
            String[] arr = br.readLine().split(" ");
            sum += Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
        }
        if(Integer.parseInt(total) == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}