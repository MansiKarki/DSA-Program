import java.util.Arrays;
public class Practice {
     public static void main(String[] args) {
        int[] arr={1,3,4,2,6,7,9};
         bubble(arr);
        System.out.println(Arrays.toString(arr));
        
     }
     static void bubble(int[] arr){
        
        for(int i = 0 ; i< arr.length; i++){ // it can be use to iterarte the ellemt
            for(int j=1; j<=arr.length-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
     }
    
}
