import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numArr = br.readLine().split(" ");
        int[] num = new int[3];
        for(int i = 0; i < numArr.length; i++) {
            num[i] = Integer.parseInt(numArr[i]);
        }
        
        Arrays.sort(num);

        System.out.println(num[1]);
    }
}