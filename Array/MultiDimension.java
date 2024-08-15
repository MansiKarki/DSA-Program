import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
         1 2 3
         4 5 6
         7 8 9
         define in 2 braces
         int[row][columns]
         */
Scanner ino = new Scanner(System.in);

        // int[][] arr = new int[3][3]

        // int[][] arr2D = {
        //     {1,2,3}, //0th index
        //     {4,5,6},//1st index
        //     {7,8,9} //2nd index --> arr2D = {7,8,9}
        // };
       ino.close();
        int[][] arr2D = new int[3][3];
        //input
        for (int row=0 ; row<arr2D.length;row++){
            //for each column in every row
            for (int col =0 ; col < arr2D[row].length ;col++ ){
               arr2D[row][col]= ino.nextInt();
              
            }
          
       
        }
    

        // for(int row=0 ; row<arr2D.length;row++){
        //     System.out.println(Arrays.toString(arr2D[row]));
        // }

        //enchance for loop
         for (int[] num : arr2D){
            System.out.println(Arrays.toString(num));
         }
      
    }

}
