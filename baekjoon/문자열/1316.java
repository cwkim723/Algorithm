package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < n; i++){
            Boolean[] check = new Boolean[26];
            Boolean isBoolean = true;
            String str = br.readLine();
            for(int j = 0; j < str.length(); j++){
                int ch = (int)str.charAt(j) - 97;

                if(check[ch] == null){
                    check[ch] = true;
                } else if (check[ch] == true){
                    if (str.charAt(j) != str.charAt(j-1)){
                        isBoolean = false;
                        break;
                    }
                }
            }
            if(isBoolean != false) count++;
        }

        System.out.println(count);
    }
}