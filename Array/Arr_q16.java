
// Given a non-negative integer(without leading zeroes) represented as an array arr. 
// Your task is to add 1 to the number (increment the number by 1). 
// The digits are stored such that the most significant digit is at the starting index of the array.

// Examples:

// Input: arr[] = [5, 6, 7, 8]
// Output: [5, 6, 7, 9]
// Explanation: 5678 + 1 = 5679
// Input: arr[] = [9, 9, 9]
// Output: [1, 0, 0, 0]
// Explanation: 999 + 1 = 1000

import java.util.Collections;

import java.util.Vector;

public class Arr_q16{
    public static void main(String[] args) {
        
    
     Vector<Integer> ans = new Vector<>();
    int[] arr = {1,2,5,6};
    int n = arr.length;
        int carry = 1;
        for (int i = n-1; i>=0; i-- ){
              if (arr[i]+carry <= 9){
                  ans.add(arr[i]+carry);
              carry = 0;
              }
              else{
                  ans.add(0);
                  carry = 1;
              }
            }
          if (carry==1) ans.add(1);
            Collections.reverse(ans);
            System.out.println(ans);
}
}