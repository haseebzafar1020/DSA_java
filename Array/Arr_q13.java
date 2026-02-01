
// Given an array arr consisting of only 0's and 1's in random order.
// Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.
// Input: arr[] = [0, 0, 1, 1, 0,0,1,0,1,1,]
// Output: [0, 0, 0, 0, 0 ,1,1,1 1, 1]



public class Arr_q13 {
     public static void main(String[] args) {
    int arr[] = {0,0,1,1,0,1,1,0,0,0,1};
    int n = arr.length;
    int i = 0;
    int j = n-1;
while (i<j){
    if (arr[i]== 0) i++;
    else if(arr[j]==1) j--;
    else if (arr[i]== 1 &&  arr[j]== 0){
        arr[i] = 0;
        arr[j] = 1;
    } 
}
for(int ele: arr){
     System.out.print(ele);
 }
}
}
