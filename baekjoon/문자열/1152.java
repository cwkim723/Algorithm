package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] caseNum = br.readLine().split(" ");
        ArrayList<String> list = new ArrayList<>();
        for(String s:caseNum){
            if(!s.isEmpty()){
                list.add(s);
            }
        }

        System.out.println(list.size());
    }
}