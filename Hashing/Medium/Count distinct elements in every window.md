## [Count distinct elements in every window](https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1)


```

class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here
        
        ArrayList<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> hm=new HashMap<>();
        int i=0;
        while(i<=k-2){
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            i++;
        }
        i--;
        int j=-1;
        
        while(i<n-1){
            i++;
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            ans.add(hm.size());
            
            j++;
            int freq= hm.get(A[j]);
            if(freq==1){
                hm.remove(A[j]);
            }else hm.put(A[j],freq-1);
        }
        return ans;
    }
}
```













![](https://drive.google.com/uc?id=1tVTTLc0dtlyJNbphECr4ePLEnaeto71w)