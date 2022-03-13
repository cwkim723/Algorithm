package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> list = new HashSet<>();

        for(int i = 0; i < 10; i++){
            int a = Integer.parseInt(br.readLine()) % 42;
            list.add(a);
        }

        System.out.println(list.size());

    }
}