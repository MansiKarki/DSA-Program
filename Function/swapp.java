class swapp {
    public static void main(String[] args) {
        int a=10 , b=20 ;
        swap(a,b);
      
    }
    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("after swaping "+ temp);
        System.out.println("after swaping "+ num1);
        System.out.println("after swaping "+ num2);
        
    }
  
  
}


// class swap{
//     public static void main(String arg[]){

//         int a=1;
//         int b=2;
//         int temp;
//  System.out.println("before the swapping");
//   System.out.println("a="+a);
//     System.out.println("b="+b);
//         System.out.println("after the swapping");
//         temp=a;
//         a=b;
//         b=temp;
//         System.out.println("a="+a);
//     System.out.println("b="+temp);
//     }
// }