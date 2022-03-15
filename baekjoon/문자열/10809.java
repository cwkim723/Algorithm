package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] alphabet = new int[arr.length];

        for(int i = 0; i < alphabet.length; i++){
            alphabet[i] = -1;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for(int j = 0; j < arr.length; j++){
                if(str.charAt(i) == arr[j]){
                    if(alphabet[j] == -1){
                        alphabet[j] = count;
                    }
                    count++;
                }
            }
        }

        for(int i = 0; i < alphabet.length; i++){
            System.out.print(alphabet[i] + " ");
        }
    }
}