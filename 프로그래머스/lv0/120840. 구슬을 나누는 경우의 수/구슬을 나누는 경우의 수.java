import java.lang.*;
import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        BigInteger top = BigInteger.ONE;
        for(int i = balls; i > share; i--) {
            top = top.multiply(BigInteger.valueOf(i));
        }
        
        BigInteger bottom = BigInteger.ONE;
        for(int i = (balls - share); i > 1; i--) {
            bottom = bottom.multiply(BigInteger.valueOf(i));
        }
        
        return (top.divide(bottom)).intValue();
    }
}
