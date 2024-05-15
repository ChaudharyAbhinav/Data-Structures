## [Postorder Traversal](https://www.geeksforgeeks.org/problems/postorder-traversal/1?page=1&difficulty%5B%5D=-1&category%5B%5D=Tree&sortBy=submissions)

```java
class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       
       ArrayList<Integer> list = new ArrayList<>();
       return postOrderTraversal(root,list);
    }
    
    ArrayList<Integer> postOrderTraversal(Node root,ArrayList<Integer> list){
        if(root==null){
            return list;
        }
        
        postOrderTraversal(root.left,list);
        postOrderTraversal(root.right,list);
        list.add(root.data);
        
        return list;
    }
}

```
### Time Complexity  : 
`O(n)`  ---> every node is travelled once
### Space Complexity :  
`Auxiliary Space` (Call Stack Space): Due to the recursive nature of the traversal, the maximum depth of the recursion stack is equal to the height of the tree.
<br>
* In the worst case, for a skewed tree (where each node has only one child), the height of the tree is `O(n)`. <br>
* In the best case, for a balanced tree, the height of the tree is `O(logn)`.

`Space for the Result List`: The result list stores the values of all nodes in the tree. `O(n)` space.
Combining these, the total space complexity is: <br>
<br>
`Worst Case`: O(n) <br>
`Best Case:` O(logn+n)=O(n) 
