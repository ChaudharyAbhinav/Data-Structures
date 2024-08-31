## Merge Sort

`Note`:
#### 1. Divide And Conquer 
 ### 2. Recursively Divide the array
 ### 3. Use Merge Two Sorted Arrays

## TC : `O(nlogn)

```java
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int arr[] = { 5, 8, 9,1,43,2,1,3};
		System.out.print(Arrays.toString(mergeSort(arr,0,arr.length-1)));
		
	}
	
	public static int[] mergeSort(int[] arr,int low,int high){
	    if(low==high){
	        int[] x= new int[1];
	        x[0] = arr[low];
	        return x;
	    }
	    
	    int mid = (low+high)/2;
	    int lha[] = mergeSort(arr,low,mid);
	    int rha[] = mergeSort(arr,mid+1,high);
	    return MergeTwoSortedArrays(lha,rha);
	}
	
	public static int[] MergeTwoSortedArrays(int arr1[], int arr2[]){
	    int e1 = arr1.length;
	    int e2=arr2.length;
	    int l1=0;
	    int l2=0;
	    int idx=0;
	    int mergedSortedArray[] =new int[e1+e2];
	    //when both arrays have elements
	    while (l1<e1 & l2<e2){
	        if(arr1[l1]<arr2[l2]){
	            mergedSortedArray[idx++]=arr1[l1++];
	            
	        }else{
	            mergedSortedArray[idx++]=arr2[l2++];
	            
	        }
	    }

	    //when arr1 have elements
	    while(l1<e1){
	        mergedSortedArray[idx++]=arr1[l1++];       
	    }
	    
	    //when arr2 have elements
	    while(l2<e2){
	        mergedSortedArray[idx++]=arr2[l2++];
	           // idx++;
	           // l2++;
	    }
	
	return mergedSortedArray;
	    
	}
	
}
```
