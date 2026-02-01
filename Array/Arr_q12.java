// Given an array arr consisting of only 0's and 1's in random order. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

// Examples :

// Input: arr[] = [0, 0, 1, 1, 0]
// Output: [0, 0, 0, 1, 1]
// Explanation:  After segregation, all the 0's are on the left and 1's are on the right. Modified array will be [0, 0, 0, 1, 1].


public class Arr_q12 {
 public static void main(String[] args) {
    int arr[] = {0,0,1,1,0,1};
  
       int totalZero = 0;
       int totalOnes = 0;
       int n = arr.length;

       for(int ele:  arr){
        if (ele == 0) {
            totalZero++;
        }
        else{
            totalOnes++;
        }
       }
       for(int i =0; i<totalZero; i++){
        arr[i] = 0;
       }
       for(int i =totalZero; i<n; i++){
        arr[i] = 1;
       }
 for(int ele: arr){
    System.out.print(ele);
 }


  
 }
}
