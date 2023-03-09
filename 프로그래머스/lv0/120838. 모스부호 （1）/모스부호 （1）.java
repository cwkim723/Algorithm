import java.util.*;

class Solution {
    public StringBuilder solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String[] arr = letter.split(" ");
        for(String str : arr) {
            String lett = getLetters(str);
            answer.append(lett);
        }
        return answer;
    }
    
    private String getLetters(String str) {
        String lett = null;
        switch(str) {
            case ".-": lett = "a"; break;
            case "-...": lett = "b"; break;
            case "-.-.": lett = "c"; break;
            case "-..": lett = "d"; break;
            case ".": lett = "e"; break;
            case "..-.": lett = "f"; break;
            case "--.": lett = "g"; break;
            case "....": lett = "h"; break;
            case "..": lett = "i"; break;
            case ".---": lett = "j"; break;
            case "-.-": lett = "k"; break;
            case ".-..": lett = "l"; break;
            case "--": lett = "m"; break;
            case "-.": lett = "n"; break;
            case "---": lett = "o"; break;
            case ".--.": lett = "p"; break;
            case "--.-": lett = "q"; break;
            case ".-.": lett = "r"; break;
            case "...": lett = "s"; break;
            case "-": lett = "t"; break;
            case "..-": lett = "u"; break;
            case "...-": lett = "v"; break;
            case ".--": lett = "w"; break;
            case "-..-": lett = "x"; break;
            case "-.--": lett = "y"; break;
            case "--..": lett = "z"; break;
        }
        
        return lett;
    }
}