## [Minimum number of deletions](https://www.geeksforgeeks.org/problems/minimum-number-of-deletions4610/1)



```java
class Solution 
{ 
    int minDeletions(String str, int n)
    {
        // code here
        String rev = "";
        for(int i=n-1;i>=0;i--){
            rev += str.charAt(i);
        }
        
        
        int[][] dp = new int[n+1][n+1];
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(rev.charAt(i-1)==str.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return n - dp[n][n];
    }
}
```
