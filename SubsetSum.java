import java.util.*;
public class Main
{
	public static void main(String[] args) {
        int[] set =  {3, 34, 4, 12, 5, 2};
        int sum = 9; 
         
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;

        for (int num : set) {
            for (int i = sum; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }
        System.out.println(dp[sum]);
    }
}
