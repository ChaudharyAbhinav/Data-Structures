## [Count Leaves in Binary Tree](https://www.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1?page=1&difficulty%5B%5D=-1&category%5B%5D=Tree&sortBy=submissions)

```java
class Tree
{
    int countLeaves(Node node) 
    {
         // Your code  
         if(node==null){
             return 0;
         }
         
         if(node.left==null && node.right==null){
             return 1;
         }
         
         
         return countLeaves(node.left) + countLeaves(node.right);
    }
   
}
```

`Time Complexity` : O(n) <br>
`Space Complexity` : O(n)  ----> `best case ` : O(log n)
