## [Fibonacci Series up to Nth term](https://www.geeksforgeeks.org/problems/fibonacci-series-up-to-nth-term/1)

```
class Solution {
    long[] Series(int N) {
        // code here
        long[] FiboTillN = new long[N+1];
       
        long a=0;
        long b=1;
        FiboTillN[0]=0;
        FiboTillN[1]=1;
        for(int i=2;i<=N;i++){
             FiboTillN[i]=a+b;
            a=b;
            b=FiboTillN[i];
        }
        return FiboTillN;
    }
}
```

```
class Solution {
    long[] Series(int N) {
        // code here
        long[] FiboTillN = new long[N+1];
       
        FiboTillN[0]=0;
        FiboTillN[1]=1;
        for(int i=2;i<=N;i++){
            FiboTillN[i]= FiboTillN[i-1]+FiboTillN[i-2];
        }
        return FiboTillN;
    }
}
```

#### `TC` O(n)
#### `SC` O(1)


