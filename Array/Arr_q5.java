// Ques: Multiply odd indexed elements by
// 2 and add 10 to even indexed elements



public class Arr_q5 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8};
       
       for (int i = 0; i< arr.length; i++){
        if (arr[i]%2==0){
          arr[i] = arr[i]+ 10;
        }
        if (arr[i]%2!=0){
            arr[i] = arr[i]*2;
        }

         System.out.print(arr[i]+" ");
       }
      

}
}