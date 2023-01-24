import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numStr = br.readLine();

        int factorial = factorial(Integer.parseInt(numStr));

        System.out.println(factorial);
    }

    private static int factorial(int n) {
        if(n <= 1) {
            return 1;
        }
        return factorial(n-1) * n;
    }
}