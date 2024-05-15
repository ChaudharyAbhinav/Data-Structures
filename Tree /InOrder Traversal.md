## [InOrder Traversal](https://www.geeksforgeeks.org/problems/inorder-traversal/1?page=1&difficulty%5B%5D=-1&category%5B%5D=Tree&sortBy=submissions)

```java
/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
       ArrayList<Integer> Inorder = new ArrayList<>();
       
       return inOrderTraversal(root,Inorder);
    }
    
    ArrayList<Integer> inOrderTraversal(Node root, ArrayList<Integer> list){
        
        if(root==null){
            return list;
        }
        
        inOrderTraversal(root.left,list);
        list.add(root.data);
        inOrderTraversal(root.right,list);
        
        return list;
    }
}
```

### Time Complexity  : 
`O(n)`  ---> every node is travelled once
### Space Complexity :  
`Auxiliary Space` (Call Stack Space): Due to the recursive nature of the traversal, the maximum depth of the recursion stack is equal to the height of the tree.

In the worst case, for a skewed tree (where each node has only one child), the height of the tree is `O(n)`.
In the best case, for a balanced tree, the height of the tree is `O(logn)`.

`Space for the Result List`: The result list stores the values of all nodes in the tree. `O(n)` space.
Combining these, the total space complexity is:
`Worst Case`: O(n)
`Best Case:` O(logn+n)=O(n) 
