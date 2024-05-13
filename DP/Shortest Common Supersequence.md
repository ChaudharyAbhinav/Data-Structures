[Shortest Common Supersequence](https://www.geeksforgeeks.org/problems/shortest-common-supersequence0322/1)

`Tip`: the question is same as longest common subsequence with just have to do `(size of 1st string + size of 2nd string)- size of longest subsequnce`

```java
class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        //Your code here
        
        int[][] dp = new int[m+1][n+1];
        
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                
                if(X.charAt(i-1)==Y.charAt(j-1)){
                    dp[i][j] =  1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
                
            }
        }
        return (m+n)-dp[m][n];
    }
}
```
