
class IsPrime{
    public static void main(String args[]){
        int n=37;
        System.out.print(PrimeOrNot(n));
    }

    public static int PrimeOrNot(int N){
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