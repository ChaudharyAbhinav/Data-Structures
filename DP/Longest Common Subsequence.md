## [Longest Common Subsequence](https://www.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1)

## Recursion 

```java
class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x,int y,String s1,String s2){
     
     int[][] dp=new int[x+1][y+1];
     
     for(int[] row : dp){
            Arrays.fill(row,-1);
        }
     
    return helper(x,y,s1,s2,dp);
    
    }
    
    
    static int helper(int x, int y, String s1, String s2,int[][] dp)
    {
        if(x==0 ||y==0) return 0;
        
        if(dp[x][y]==-1){
            
            if(s1.charAt(x-1)==s2.charAt(y-1)){
                
                dp[x][y] = 1 + helper(x-1,y-1,s1,s2,dp);
            }
            else{
                
                dp[x][y] = Math.max( helper(x-1,y,s1,s2,dp) , helper(x,y-1,s1,s2,dp) );
            }
            
        }
      return dp[x][y];  
    }
    
}
```


## Memoization
```java
class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x,int y,String s1,String s2){
     
     int[][] dp=new int[x+1][y+1];
     
     for(int[] row : dp){
            Arrays.fill(row,-1);
        }
     
    return helper(x,y,s1,s2,dp);
    
    }
    
    
    static int helper(int x, int y, String s1, String s2,int[][] dp)
    {
        if(x==0 ||y==0) return 0;
        
        if(dp[x][y]==-1){
            
            if(s1.charAt(x-1)==s2.charAt(y-1)){
                
                dp[x][y] = 1 + helper(x-1,y-1,s1,s2,dp);
            }
            else{
                
                dp[x][y] = Math.max( helper(x-1,y,s1,s2,dp) , helper(x,y-1,s1,s2,dp) );
            }
            
        }
      return dp[x][y];  
    }
    
}
```
## Tabulation
```java
class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int [][] dp = new int[x+1][y+1];
        
        for(int i=0;i<x+1;i++){
            for(int j=0;j<y+1;j++){
                if(i==0 || j==0 ) dp[i][j]= 0;
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
              
            }
        }
        return dp[x][y];
    }
    
}
```

