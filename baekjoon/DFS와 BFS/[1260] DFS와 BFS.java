package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]); // 정점의 개수
        int M = Integer.parseInt(str[1]); // 간선의 개수
        int V = Integer.parseInt(str[2]); // 탐색을 시작할 정점의 번호

        arr = new int[N+1][N+1]; // 정점들이 만나는지 표시를 해주기 위해 [해당 정점][그 정점과 만나는 다른 정점]

        for(int i = 0; i < M; i++) {
            String[] str2 = br.readLine().split(" ");

            int a = Integer.parseInt(str2[0]);
            int b = Integer.parseInt(str2[1]);

            // 지나가는 건 1, 지나가지 않는 건 0으로 표시해줌(행렬의 원리 생각하면 됨)
            arr[a][b] = 1;
            arr[b][a] = 1;
            // 입력으로 주어지는 간선은 양방향이므로 둘 다 체크해준다.
        }

        visited = new boolean[N + 1]; // 방문 여부
        dfs(V);

        System.out.println();

        visited = new boolean[N + 1];
        bfs(V);
    }

    static void dfs(int V) {
        visited[V] = true;
        System.out.print(V + " ");

        if(V > arr.length - 1) {
           return;
        }
        
        for(int node = 1; node < arr.length; node++) {
            // node가 1부터 시작하는 이유: 정점의 개수 N의 범위가 1 ≤ N ≤ 1,000이기 때문
            if(arr[V][node] == 1 && visited[node] == false) {
                // arr[V][node] == 1: 연결된 두 정점이다 / visited[j] == false: 아직 방문하지 않았다
                dfs(node); // -> 다시 dfs(j) 함수를 호출해줌(재귀함수) -> 호출하면 이제 방문했다는 표식을 남길 수 있음
            }
        }
    }

    static void bfs(int V) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(V); // 큐에 해당 정점 번호를 넣어줌
        visited[V] = true; // 방문했다는 표식을 남겨줌
        System.out.print(V + " ");

        while(!queue.isEmpty()) { // 큐가 비어있지 않으면
            int temp = queue.poll(); // 큐에 담겨있는 번호 중 가장 앞에 담겨져있는 번호
            for(int node = 1; node < arr.length; node++) {
                if(arr[temp][node] == 1 && visited[node] == false) {
                    // // 해당 노드와 연결된 다른 노드가 있고 그 다른 노드를 아직 방문하지 않았다면
                    queue.add(node); // 다른 노드를 queue에 넣고
                    visited[node] = true; // 방문했다는 표식을 남겨줌
                    System.out.print(node + " ");
                }
            }
        }
    }
}

