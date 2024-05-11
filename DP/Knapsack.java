## Knapsack
![GFG-link](https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1)
            

## Recursion

class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         return solve(W,wt,val,n);
         
    } 
    
    static int solve(int W,int wt[],int val[],int n){
        
        if(n==0 || W==0) return 0;
        

        if(wt[n-1] <=W){
            return Math.max(val[n-1]+solve(W-wt[n-1],wt,val,n-1),solve(W,wt,val,n-1));
        }else{
            return solve(W,wt,val,n-1);
        }
       
   
    }
}


## Memoization

class Solution 
{ 
    static int dp[][] = new int[1001][1001];
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         for(int i=0;i<=n;i++){
             for(int j=0;j<=W;j++){
                 dp[i][j]=-1;
             }
         }
         
         return solve(W,wt,val,n);
         
    } 
    
    static int solve(int W,int wt[],int val[],int n){
        
        if(n==0 || W==0) return 0;
        
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        
        
        if(wt[n-1] <=W){
            return dp[n][W] = Math.max(val[n-1]+solve(W-wt[n-1],wt,val,n-1),solve(W,wt,val,n-1));
        }else{
            return dp[n][W]= solve(W,wt,val,n-1);
        }
       
   
    }
}


## DP
class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int [][] dp =new int[n+1][W+1];
         for(int i=0;i<n+1;i++){
             for(int j=0;j<W+1;j++){
                 if(i==0 || j==0 ){
                     dp[i][j]= 0;
                 }else if(wt[i-1]<=j){
                     int take = val[i-1]+dp[i-1][j-wt[i-1]];
                     int skip = dp[i-1][j];
                     dp[i][j]=Math.max(take,skip);
                 }else{
                     dp[i][j]= dp[i-1][j];
                 }
             }
         }
         return dp[n][W];
    } 
}
