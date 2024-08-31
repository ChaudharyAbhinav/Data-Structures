  ### selectionSort : 
    1.  select min and swap with min 
    2. best case: 0(n2)
    3. not stable

### insertionSort :
    1. reverse bubble
    2. o(n) -best 
    3. 0(n2) -worst

### bubbleSort :
    1. swap j with j+1
    2. 0(n) -best
    3. 0(n2) - worst

### selection sort
```
  public class Main
  {
  	public static void main(String[] args) {
  		
  		    int arr[]={10,25,35,45,12,65};
  		    bubbleSort(arr);
  		    System.out.print(java.util.Arrays.toString(arr));
  		
  	}
	public static void selectionSort(int[] arr){
	    int n=arr.length;
	    for(int i=0;i<n-1;i++){
	        int min=i;
	        for(int j=i+1;j<n;j++){
	            if(arr[min]>arr[j]){
	                min=j;
	            }
	        }
	        //swap
	        int temp = arr[min];
	        arr[min] = arr[i];
	        arr[i] = temp;
	    }
	}
```

## InsertionSort

```java
	public static void insertionSort(int[] arr){
	    int n = arr.length;
	    for(int i=1;i<n;i++){
	        
	        for(int j=i-1;j>=0;j--){
	            if(arr[j]>arr[j+1]){
	                //swap
	                int temp= arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	            }else{
	                break;
	            }
	        }
	    }
	    
	}
```

## BubbleSort
```java
	public static void bubbleSort(int[] arr){
	    
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        
	        for(int j=0;j<n-i-1;j++){
	            if(arr[j]>arr[j+1]){
	                int temp = arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	            }
	        }
	    }    
	}
```
