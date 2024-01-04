### [Array Subset of another array](https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab)


```
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        
        HashMap<Long,Long> ans = new HashMap<>();
        
        if(m>n) return "No";
        
        for(int i=0;i<n;i++){
            ans.put(a1[i],ans.getOrDefault(a1[i],0L)+1);
        }
        
        for(int i=0;i<m;i++){
            if(ans.containsKey(a2[i])  && ans.get(a2[i])>0){
                ans.put(a2[i],ans.get(a2[i])-1);
            }else{
                return "No";
            }
        }
    return "Yes";
    }
}
```


![Solution](https://drive.google.com/uc?id=1XseD5ot64tmsU3DYQxCQZVUufi8AuJQ6)
