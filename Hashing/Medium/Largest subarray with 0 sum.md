## [Largest subarray with 0 sum](https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1)


```
class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
         
        int len=0, maxLen =0;
        int sum=0;
        int i=-1;
        hm.put(sum,i);
        
        while(i<n-1){
            i++;
            sum += arr[i];
            
            if(hm.containsKey(sum)){
                len = i-hm.get(sum);
                maxLen = Math.max(maxLen,len);
            }else hm.put(sum,i);
            
        }
        return maxLen;
    }
}
```

![](https://drive.google.com/uc?id=1VWfOp85c90KMz6VosJpf8Td2nibA0xBe)