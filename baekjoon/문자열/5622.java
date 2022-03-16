package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        char[] arr = new char[number.length()];
        int time = 0;

        for(int i = 0; i < number.length(); i++){
            arr[i] = number.charAt(i);
        }

        for(int i = 0; i < arr.length; i++){
            if((int)arr[i] >= 65 && (int)arr[i] <= 67){
                time += 3;
            } else if((int)arr[i] >= 68 && (int)arr[i] <= 70){
                time += 4;
            } else if((int)arr[i] >= 71 && (int)arr[i] <= 73){
                time += 5;
            } else if((int)arr[i] >= 74 && (int)arr[i] <= 76){
                time += 6;
            } else if((int)arr[i] >= 77 && (int)arr[i] <= 79){
                time += 7;
            } else if((int)arr[i] >= 80 && (int)arr[i] <= 83){
                time += 8;
            } else if((int)arr[i] >= 84 && (int)arr[i] <= 86){
                time += 9;
            } else if((int)arr[i] >= 87 && (int)arr[i] <= 90){
                time += 10;
            } else {
                time += 1;
            }
        }

        System.out.println(time);
    }
}