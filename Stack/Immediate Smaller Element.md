## [Immediate Smaller Element](https://www.geeksforgeeks.org/problems/immediate-smaller-element1142/1?page=1&difficulty%5B%5D=-1&category%5B%5D=Stack&sortBy=submissions)

### Approach 1 : Arrays

```java
class Solution1 {
    void immediateSmaller(int arr[], int n) {
        // code here
        int[] ans=new int[n];
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                ans[i]=arr[i+1];
            }else{
                ans[i]=-1;
            }
        }
        
        ans[n-1]=-1;
        
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
        // return Arrays.tostring(ans);
    }
}
```
#### `TC` : O(n)
#### `SC` : O(n)



### Approach 2 : Stack

```java
class Solution {
    void immediateSmaller(int arr[], int n) {
        // code here
       Stack<Integer> st=new Stack<Integer>();
     st.push(-1);
       for(int i=n-2;i>=0;i--){
           
               if(arr[i]>arr[i+1]){
                   st.push(arr[i+1]);
               }else{
                   st.push(-1);
               }
           
       }
       int i=0;
       while(!st.empty()){
           arr[i++]=st.peek();
           st.pop();
       }
    }
}
```

#### `TC` : O(n)
#### `SC` : O(n)
