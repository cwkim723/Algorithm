class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String[] arr = String.valueOf(x).split("");
        for(String str : arr) {
            sum += Integer.parseInt(str);
        }
        return x % sum == 0;
    }
}