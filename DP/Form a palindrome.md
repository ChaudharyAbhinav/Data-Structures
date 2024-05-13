## [Form a palindrome](https://www.geeksforgeeks.org/problems/form-a-palindrome1455/1)

`Tip` : its a LCS pattern -- `find lcs of String with its reverse`

`no of insertions to make pallindrome` : `String length - lcs`

```java
class Solution{
    static int countMin(String str)
    {
        // code here
        String rev = "";
        
        for(int i =str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        
        return MinOperations(str, rev);
    }
    
    static int MinOperations(String str, String rev){
        int m = str.length();
        int n=rev.length();
        int[][] dp = new int[m+1][n+1];
        
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                
                if(str.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j] =  1 +  dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        
        return m-dp[m][n];
    }
}

```
