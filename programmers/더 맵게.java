package String;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++){
            priorityQueue.add(scoville[i]);
        }

        for (int i = priorityQueue.size() - 1; i >= 0; i--) {
            if(priorityQueue.size() == 1 && priorityQueue.peek() < K) {
                return -1;
            } else if (priorityQueue.peek() >= K){
                break;
            }

            int a = priorityQueue.poll();
            int b = priorityQueue.poll();
            int newScoville = a + (b * 2);
            priorityQueue.add(newScoville);

            answer++;
        }

        return answer;
    }
}