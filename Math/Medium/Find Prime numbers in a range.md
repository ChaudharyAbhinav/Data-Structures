
## [Find Prime numbers in a range](https://www.geeksforgeeks.org/problems/find-prime-numbers-in-a-range4718/1)

```
class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer> primeNoMtoN = new ArrayList<>();
        for(int num=M;num<=N;num++){
        int count=0;
        if(num==1) num++;
            for(int div=2;div*div<=num;div++){
                if(num%div==0){
                  count++ ; 
                  break;  
                    } 
                }
                if(count==0) primeNoMtoN.add(num);
            }
            return primeNoMtoN;
        }
}
```

#### `TC` O(n*sqrt(n))
#### `SC` O(1)
