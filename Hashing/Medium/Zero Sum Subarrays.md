## [Zero Sum Subarrays](https://www.geeksforgeeks.org/problems/zero-sum-subarrays1825/1)

```
class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        HashMap<Long,Integer> hm=new HashMap<>();
        
        int i=-1;
        long sum=0;
        long count=0;
        hm.put(sum,1);
        
        while(i<n-1){
            i++;
            sum+= arr[i];
            
            if(hm.containsKey(sum)){
                count += hm.get(sum);
                hm.put(sum,hm.get(sum)+1);
               
            }else{
                hm.put(sum,1);
            }
        }
        return count;
    }
    
}
```

![](https://drive.google.com/uc?id=14R_vjkZYhDpKZCfm9U81jhS1XqipvN7Y)
