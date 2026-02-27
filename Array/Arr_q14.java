// Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
// Note: You need to solve this problem without utilizing the built-in sort function.

// Examples:

// Input: arr[] = [0, 1, 2, 0, 1, 2]
// Output: [0, 0, 1, 1, 2, 2]
// Explanation: 0s, 1s and 2s are segregated into ascending order.
// Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
// Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
// Explanation: 0s, 1s and 2s are segregated into ascending order.

public class Arr_q14 {
 public static void main(String[] args) {
    int[] arr  = {0, 1, 2, 0, 1, 2,1,1,2,2,2,2,0,0,0}; // 5 4 6
     int n = arr.length;
    
    int no0 = 0;
    int no1 = 0;
    int no2 =0;
  for (int ele: arr){
    if (ele == 0) no0++;
    if (ele == 1) no1++;
    if (ele == 2) no2++;
  }  
 System.out.println(no0 +" "+no1+ " "+ no2 );
   for (int i = 0; i< no0; i++){
    arr[i] = 0;
    no1++;
   }

   for (int i = no0; i<no1; i++){
    arr[i] = 1;
    
   }

    for (int i = no1; i<n ; i++){
    arr[i] = 2;
   }

    for(int ele: arr){
     System.out.print(ele);
 }
 }
  
}
