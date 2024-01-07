
## [Prime Number](https://www.geeksforgeeks.org/problems/prime-number2314/1)

```
class Solution{
    static int isPrime(int N){
        // code here
        int count=0;
        if(N==1)  return 0;
        for(int div=2;div*div<=N;div++){
            if(N%div==0){
                count++;
                break;
            }
        }
        return (count!=0) ? 0 : 1 ;
    }
}

```

#### `TC` O(logn)
#### `SC` O(1)
