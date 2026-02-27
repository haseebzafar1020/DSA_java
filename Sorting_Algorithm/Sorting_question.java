//Ques: 2 Sum - Find a pair with given sum
//  like target: 9 

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting_question {
    public static void main(String[] args) {
    int arr[] ={5,7,8,9};
    int n = arr.length;
     Arrays.sort(arr);
     int target = 9 ; 
       int i = 0;
       int j = n-1;
     while (i<j) {
        if (arr[i] + arr[j] == target) {
            System.out.println("yes target match" + " : "+target );
         
        }
        else if(arr[i] + arr[j] > target ){
            j--;
        }
        else if(arr[i] + arr[j] < target){
            i++;
        }
        else{
            System.out.println("target not match"+" "+target);
        }

     }

    
    }
}
