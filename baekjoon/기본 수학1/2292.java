package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = 1;  // 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지에 대한 값(정답). 1번은 필수로 지나므로 디폴트 값은 1로 해주었다.
        int max = 1; // max = 1 + (6 * (2 - 1)) + (6 * (3 - 1)) + ... + (6 * (k - 1)) 이므로 디폴트 값 1로 초기화.
                    // max = k개의 방을 지나 갈 수 있는 가장 큰 방번호.

        //     ~ max번                                k개
        // 1번       (총 1개)                      : 1개
        // 2번 ~ 7번 (총 6개 == 6 * (2 - 1))       : 2개
        // 8번 ~ 19번 (총 12개 == 6 * (3 - 1))     : 3개
        // 20번 ~ 37번 (총 18개 == 6 * (4 - 1))    : 4개
        // 38번 ~ 61번 (총 24개 == 6 * (5 - 1))    : 5개
        // i번 ~ j번   (총 6 * (k - 1)개)          : k개 (i <= n <= j 가정)
        // ...
        // n <= 6 * (1+2+3+...+k) && n >= 6 * (1+2+3+...+k-1)


        // 주어진 방 번호(n번)가 max번 보다 크다면 반복문 돌리기.
        // ex. n = 58번일 때
        //      max번이 37번(max) 이라면 -> 58번(n)까지 도달하지 못했으므로 실패 (n > max)
        //      max번이 61번 이라면 -> 58번(n)까지 도달이 가능하므로 성공! (n < max)
        while(n > max){
            if (n == 1){
                break;
            } // n이 1이라면 자기 자신만 지나므로 반복문을 멈추고 k = 1이 된다.

            k++; // 지나서 가야할 방이 하나 더 늘어나므로 k++을 해준다.
            max += 6 * (k - 1); // 지나야 하는 방이 1개 더 늘었으므로 기존 max번까지 갈 수 있었던 방의 갯수가 6 * (k - 1)개 더 늘어나게 된다.
        }

        System.out.println(k);
    }
}