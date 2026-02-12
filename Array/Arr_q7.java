
// Array num ko plus karo jo target ka baraber hu us ko print karoo 

public class Arr_q7 {
    public static void main(String[] args) {
        int[] arr = { 2,-3,-5, 6, 8 , 5};
        int target = 2;
       int  result = 0 ;
        for(int i =0; i<arr.length; i++ ){
          for(int j = 1; j<arr.length; j++ ){
            if(arr[i] + arr[j] == target){
            result = arr[i] + arr[j];
               
            }
            
          }
        }
        if (result==target){
         System.out.println("yes target matched : "+ result);
        }
        else{
            System.out.println("target not matched");
        }
    }
}
