
// Given an sorted array arr[] of integers. Sort the array into a wave-like array(In Place).
//  In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] ..... and so on. 
//  If there are multiple solutions, find the lexicographically smallest one.

// Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array.

// Examples:

// Input: arr[] = [1, 2, 3, 4, 5]
// Output: [2, 1, 4, 3, 5]
// Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.
public class Arr_q15 {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5,6,7};
        int n = arr.length;
          
        for(int i=0; i<n-1; i= i+2){
            if (i==n-1) break;
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                
            
        }


        for (int ele: arr){
            System.out.print(ele+" ");
        }


    }
}
