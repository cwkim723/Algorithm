package String;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10001];

        for (int i = 1; i<10001; i++) {
            int notSelfNum = calc(i);

            if (notSelfNum < 10001) {
                arr[notSelfNum] = 1;
            }
        }

        for(int i = 1; i < 10001; i++){
            if(arr[i] == 0){
                System.out.println(i);
            }
        }
    }

    static int calc(int start){
        int sum = start;

        while(start != 0){
            sum += (start % 10);
            start = start / 10;
        }

        return sum;
    }
}