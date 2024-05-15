## [Preorder Traversal](https://www.geeksforgeeks.org/problems/preorder-traversal/1?page=1&difficulty[]=-1&category[]=Tree&sortBy=submissions)

```java
class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        
        preOrder(list, root);
        return list;
    }
    
    static void preOrder(ArrayList<Integer> list, Node root){
        if(root==null){
            return ;
        }
        
        list.add(root.data);
        preOrder(list,root.left);
        preOrder(list,root.right);
        
        
       
    }

}
```

`Time Complexity` : O(n)
`Space Complexity` : O(n)

`for detailed sc ` : 
#### [click me](https://github.com/ChaudharyAbhinav/Data-Structures/blob/main/Tree%20/InOrder%20Traversal.md)
