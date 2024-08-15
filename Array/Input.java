import java.util.Arrays;
import java.util.Scanner; 
class Input
 {
    public static void main(String[] args) {
        int[] arr =new int[5];
        Scanner sc = new Scanner(System.in);
        // array of primitive
        arr[0]=23;
        arr[1]=39;
        arr[2]=12;
        arr[3]=56;
        arr[4]=19;
        System.out.println(arr[3]);
        sc.close();


        //input using for loop for input
        // for(int i=0 ; i < arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
    
          //output for loop for displaying
        // for(int i=0 ; i < arr.length; i++){
        //     System.out.println(arr[i] +  " ");
        // }


      // another way to get the output for loop for displaying
        // for (int num : arr){//for every element in array , print the element
        //     System.out.print(num + " "); // here num represent element of the array
        // }


        // System.out.print(arr[5]); index out of bound  error


        //array of object 
        String[] str = new String[5];
        for(int i=0 ; i < str.length; i++){
          str[i] = sc.next();
      }
      System.out.println(Arrays.toString(str));
//modify
      str[1]="puni";
      System.out.println(Arrays.toString(str));
    }
}
