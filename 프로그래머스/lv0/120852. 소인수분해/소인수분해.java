import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        boolean[] prime = new boolean [n+1]; 
        for(int i = 2; i <= n ; i++) {
            prime[i] = true;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
			while (n % i == 0) {
                set.add(i);
				n /= i;
			}
		}
        
		if (n != 1) {
            set.add(n);
		}
        
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            list.add(iterator.next());
        }
        
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}