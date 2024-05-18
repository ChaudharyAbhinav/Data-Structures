## [Search in BST)[https://www.geeksforgeeks.org/problems/search-a-node-in-bst/1]

```java
class BST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        // Your code here
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        
        
        return root.data > x ? search(root.left,x) : search(root.right,x);
        
    }
}
```

`Time COmplexity` : O(log n)<br>
'Space Complexity` : O(n)
