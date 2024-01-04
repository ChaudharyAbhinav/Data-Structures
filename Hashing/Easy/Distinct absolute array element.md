## [Distinct absolute array elements](https://www.geeksforgeeks.org/problems/distinct-absolute-array-elements4529/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab)

```
class Solution {
    int distinctCount(int[] arr, int n) {
        // code here
        
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0;i<n;i++) hs.add(Math.abs(arr[i]));
        return hs.size();
    }
}
```


#### Time Complexity: O(n)
#### Space Complexity: O(n)

*Note* : we can optimize space using 2 pointers.
