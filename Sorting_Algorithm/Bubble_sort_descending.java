public class Bubble_sort_descending {
    
         public static void print (int[] a){
    for(int ele: a){
        System.out.print(ele+" ");
    }

    System.out.println();
}
    public static void main(String[] args) {
        
        
    int[] arr = {1,3,5,7,4,2,6};
    // int[] arr = {1,2,3,4,5,6,7};
    int n  =  arr.length;
print(arr);


for(int i = 0; i<n-1; i++ ){ // ya loop bata ga ka kitni dafa swap hu to sort hu jay ga array hamara
    int swap = 0;
for(int j = 0; j<n-1-i;  j++){  // ya loop itni dafa hi swap karay ga.
    if(arr[j] < arr[j+1]){
        int temp  = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        swap++;
    } 
}

if(swap == 0) break;
}

print(arr);

    }
}


    
