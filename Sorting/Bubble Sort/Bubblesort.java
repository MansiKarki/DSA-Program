import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr= {1,2,4,5,3,5,7};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int[] arr){
        //run the step n-1 times
        boolean swapped;
        for(int i = 0 ; i < arr.length ; i++){
            swapped = false;
            //for each step , max item will come at the last respective index
            for ( int j = 1 ; j <= arr.length - 1 ;j++){
                //swap if the item is smaller than the previous
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
              //if you did not swap for particular value of  it means the array is sorted stop the program break it
        if(!swapped){ // !false = true
            break;
        }
    }
        }
      
}
