## [Count pairs in array divisible by K](https://www.geeksforgeeks.org/problems/count-pairs-in-array-divisible-by-k/1)

```
class Solution
{
    public static long countKdivPairs(int arr[], int n, int k)
    {
        //code here
        HashMap<Integer,Integer> map=new HashMap<>();
        
        long count=0;
        
        
        for(int i=0;i<n;i++){
            int curr= arr[i]%k;
            if(map.containsKey((k-curr)%k))
                count += map.get((k-curr)%k);
            map.put(arr[i]%k,map.getOrDefault(arr[i]%k,0)+1);
            
        }
        return count;
    }
}
```


#### `Time Complexity`  O(n)
#### `Space Complexity` O(1)