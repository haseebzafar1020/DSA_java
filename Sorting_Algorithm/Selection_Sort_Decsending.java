public class Selection_Sort_Decsending {
    public static void main(String[] args) {
          
       int arr[] ={1,-3,5,2,6,5,4,8};
        int n= arr.length;
      
  


        for(int i= n; i<0; i--){
           int max = Integer.MAX_VALUE;
           
         int mindx =-1;
         for(int j = i; j<0; j--){
              if (arr[j] < max) {
                max = arr[j];
                mindx = j;
              }
         }
             int temp = arr[i];
             arr[i] = arr[mindx];
             arr[mindx] = temp;
          
        }
    
    for(int ele: arr){
            System.out.print(ele);
           }
    }
}
