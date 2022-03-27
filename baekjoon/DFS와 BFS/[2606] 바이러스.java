package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[][] arr;
    static boolean[] visited;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        int M = Integer.parseInt(br.readLine()); // 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수

        arr = new int[N+1][N+1];

        for(int i = 0; i < M; i++) {
            String[] str = br.readLine().split(" ");

            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        visited = new boolean[N + 1];
        dfs(1); // 1의 자식 노드들만 출력됨!
        System.out.println(answer);
    }

    static void dfs(int V) {
        visited[V] = true;

        if(V > arr.length - 1) {
           return;
        }

        for(int node = 1; node < arr.length; node++) {
            if(arr[V][node] == 1 && visited[node] == false) {
                answer += 1;
                dfs(node);
            }
        }
    }
}
