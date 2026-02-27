
// merge 2 sorted array
public class Arr_q17 {
    public static void main(String[] args) {
        
    
    int[] arr = {2,4,6,8,9,10};
    int[] brr = {1,7,9,23,67,78};
    int[] krr = new int[arr.length + brr.length] ;

for(int ele : krr){
    System.out.print(ele);
}

System.out.println();
    mearge (krr,arr,brr);

for(int ele : krr){
    System.out.print(ele);
}


}
    public static void mearge(int[] krr , int [] arr, int[] brr ) {
        int i = 0;
        int j = 0;
        int k = 0;

        while ( i < arr.length && j < brr.length ) {
            if(arr[i] < brr[j]){
                krr [k] = arr[i];
                i++;
                k++;
            }
            else{
                krr[k] = brr[j];
                j++;
                k++;
            }


            if (i == arr.length) {
                while(j < brr.length){
                krr[k] = brr[j];
                j++;
                k++;
                }
            }
            
             if (j == brr.length) {
                while(i < arr.length){
                krr[k] = arr[i];
                
                i++;
                k++;
                }
            }
            
            
        }
       
    }
}

