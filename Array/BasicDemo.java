public class BasicDemo {
    public static void main(String[] args) {
        // Store the roll no
        // int a=10;
        // Store the person name
        // String name= "mansi karki";
        
        //syntax of array / declaration syntax
        //datatype[] variable name = new datatype[size];



        // example

         // Store the  5 roll no

        //  int[] rollno = new int[5];
         //or directly
        //  int[] rollno2 = { 1,2,3,4,5};


         int[] ros;//declaration of array rollno is getting defined int the stack internally the element will be {0,0,0,0,0}
         ros =new int[5]; //initialiazation : actually here object is being created in the memory(heap)
         System.out.println(ros[1]);

         String[] arr= new String[4];
         System.out.println(arr[1]);
    }
}
