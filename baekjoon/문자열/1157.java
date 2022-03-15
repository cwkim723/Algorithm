package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase(Locale.ROOT);
        char[] arr = new char[word.length()];
        Set<Character> set = new HashSet<>();
        int max = 0;
        Character answer = null;

        for(int i = 0; i < word.length(); i++){
            arr[i] = word.charAt(i);
            set.add(word.charAt(i));
        }
        
        ArrayList<Character> list = new ArrayList<>(set);
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < list.size(); i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(list.get(i) == arr[j]){
                    count++;
                }
            }
            map.put(list.get(i), count);
            if(max < count){
                max = count;
            }
        }

        int maxCount = 0;
        for(Character s : map.keySet()){
            if(max == map.get(s)){
                answer = s;
                maxCount++;
            }
        }

        if(maxCount > 1){
            System.out.println("?");
        } else {
            System.out.println(answer);
        }
    }
}