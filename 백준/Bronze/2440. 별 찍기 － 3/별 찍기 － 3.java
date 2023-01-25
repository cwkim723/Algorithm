import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strNum = br.readLine();
        int num = Integer.parseInt(strNum);

        for(int i = 0; i < num; i++) {
            for(int j = num - i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}