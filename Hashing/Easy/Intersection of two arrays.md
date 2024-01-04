## [Intersection of two arrays](https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab)

```
class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        
        int count=0;
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0;i<n;i++){
            hs.add(a[i]);
        }
        
        for(int i=0;i<m;i++){
            if(hs.contains(b[i])){
                count++;
            }
	*VVIMP:to remove duplicate element from b array*
	//1 2 34 54 6 4 7 
	//33 5 4 5 4
            hs.remove(b[i]);
        }
        return count;
    }
};
```

