import java.util.Arrays;
public class Practice {
     public static void main(String[] args) {
        int[] arr={1,3,4,2,5};
         bubble(arr);
        System.out.println(Arrays.toString(arr));
        
     }
     static void bubble(int[] arr){
        
        for(int i = 0 ; i< arr.length; i++){ // it can be use to iterarte the element
            for(int j=1; j<=arr.length-1;j++){// the number interal number will be reduce after each iteration
                if(arr[j]<arr[j-1]){ 
                    int temp = arr[j];//if the item is  smaller than previous item then swap
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
     }
    
}
