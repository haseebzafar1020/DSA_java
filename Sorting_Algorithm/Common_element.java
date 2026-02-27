
// Input: a[] = [3, 4, 2, 2, 4] , b[] = [3, 2, 2, 7]
// Output: 2 2 3

import java.util.ArrayList;
import java.util.Arrays;

public class Common_element {
    public static void main(String[] args) {
       
         
      int  a[] = {3, 4, 2, 2, 4} , b[] = {3, 2, 2, 7} ;
       Arrays.sort(a);
        Arrays.sort(b);
       ArrayList<Integer> ans = new  ArrayList<>();
       
       int i=0 , j= 0;
       
       while(i<a.length && j<b.length){
           if (a[i]==b[j]){
               ans.add(a[i]);
               i++;
               j++;
           }
            else if(a[i]<b[j])
            {
                i++;
                
            }
             else {
                 
                 j++;
                 
             }
       }
      

System.out.println(ans);
     


    }
}
