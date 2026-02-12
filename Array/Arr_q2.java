// Ques: Print sum of positive elements of the
// array.
public class Arr_q2 {
    public static void main(String[] args) {
        int arr [] ={1,-3,-4,-6,6};
        int n =arr.length;
        int sum_arry = 0;
        for(int i=0; i<n ; i++){
            if (arr[i] > 0) {
                sum_arry += arr[i];    
            }    
    }
    System.out.print(sum_arry);
}
}
