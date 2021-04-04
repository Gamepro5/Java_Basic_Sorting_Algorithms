import java.lang.reflect.Array;
import java.util.Arrays;

 

//Bubble Sort, Selection Sort, Insertion Sort

 

public class SortingAlgorithms {

 

 public static void main(String[] args) {

 

  int[] nums = {10, 3, 2, 7, 6, 8, 4, 1, 5, 9};
  //int[] nums2 = addElement(12, nums);
  //selectionSort(nums2);
  //System.out.println(Arrays.toString(nums2));
 

  //bubbleSort(nums);
  //System.out.println(Arrays.toString(nums));


 //selectionSort(nums);
  //System.out.println(Arrays.toString(nums));
  
  
  insertionSort(nums);
  System.out.println(Arrays.toString(nums));
 

}

 

    public static void bubbleSort(int[] arr) {

    Boolean sorted = false;
    while (!sorted) {
    	int sortedItems = 0;
    	for (int i=0;i<arr.length;i++) {
    		try {
    			if (arr[i+1] < arr[i]) {
    				int temp = arr[i+1];
    				arr[i+1] = arr[i];
    				arr[i] = temp;
    			} else {
    				sortedItems += 1;
    			}
    		} catch (IndexOutOfBoundsException e) {
    			if (arr[i] < arr[0]) {
    				int temp = arr[i];
    				arr[i] = arr[0];
    				arr[0] = temp;
    			} else {
    				sortedItems += 1;
    			}
    		}
    	}
    	if (sortedItems == arr.length) {
    		sorted = true;
    	} else {
    		sorted = false;
    	}
    }
    }


 
//{3, 9, 7, 1, 8, 2, 10, 4, 6, 5}
    public static void selectionSort(int[] arr) {

    
    for (int j=0;j<arr.length;j++) {
    	int item = arr[j];
    	int ref = j;
    	for (int i=j;i<arr.length;i++) {
        	try {
        		if (item > arr[i+1]) {
        			item = arr[i+1];
        			ref = i+1;
        		}
        	} catch (IndexOutOfBoundsException e) {
        		arr[ref] = arr[j];
        		arr[j] = item;
        		System.out.println(Arrays.toString(arr));
        	}
        }
    }
    }

 

    public static void insertionSort(int[] arr) {
//FIRST TRY I GOT THIS CORRECT!
    	for (int i=0;i<arr.length;i++) {
    		try {
	    		for (int j=i;j>0;j--) {
	    			if (arr[i] < arr[i-j]) {
	    				int temp = arr[i];
	    				arr[i] = arr[i-j];
	    				arr[i-j] = temp;
	    			}
	        	}
    		} catch (IndexOutOfBoundsException e) {
    			
    		}
    	}

    }
    
    
    public static int[] addElement(int datum, int[] sortedArray) {
    	int[] tempArray = new int[sortedArray.length+1];
    	for (int i = 0;i<sortedArray.length;i++) {
    		tempArray[i] = sortedArray[i];
    	}
    	tempArray[tempArray.length-1] = datum;
    	selectionSort(tempArray);
    	return tempArray;
    	
    	
    }
    
    }