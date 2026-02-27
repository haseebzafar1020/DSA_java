public class Selection_sort {
    public static void main(String[] args) {
        int arr[] ={1,-3,5,2,6,5,4,8};
        int n= arr.length;

        for(int i=0; i<n; i++){
         int min = Integer.MAX_VALUE;
         int mindx =-1;
         for(int j =i; j<n; j++){
              if (arr[j] < min) {
                min = arr[j];
                mindx = j;
              }
         }
             int temp = arr[i];
             arr[i] = arr[mindx];
             arr[mindx] = temp;
          
        }



        
    //     for(int i=0; i<n; i++){
    //        for(int j= 0; j<n; j++){
    //            if(arr[i] < arr[j]){
    //                int temp = arr[j];
    //                arr[j] = arr[i];
    //                arr[i]= temp;
    //            }
    //        }
    // }
           
    
    for(int ele: arr){
            System.out.print(ele);
           }
            
}
}