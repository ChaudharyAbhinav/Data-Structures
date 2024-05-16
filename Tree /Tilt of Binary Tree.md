## [Tilt of Binary Tree](https://www.geeksforgeeks.org/problems/tilt-of-binary-tree/1)


```java
class Solution{
    public int tiltTree(Node root){
        //code here
        solve(root);
        return tilt;
    }
     int tilt=0,sum =0;
    
    public int solve(Node node){
        
        if(node==null){
            return 0;
        }
        
        int lt = solve(node.left);
        int rt= solve(node.right);
        
         tilt += Math.abs(lt-rt);
        
        sum = lt + rt + node.data;
        return sum;
    }
}
```

`Time Complexity` : O(n) <br>
`Space Complexity` : O(n)
