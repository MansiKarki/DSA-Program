class largestarray 
{
        void  smallest()
        {
             int arr[] = {1, 2, 3, 488, -5, 2, 11, 212}; 
            int min = arr[0]; 
            int pos=0;
            for (int i = 1; i < arr.length; i++) 
            {
               if (arr[i] < min) {   
               min = arr[i]; 
               pos= i;
                
               }   
            }
            
            System.out.println("Smallest element index "+pos);
             System.out.println("Smallest Element"+min);
        }
          void  largest()
        {
             int arr[] = {1, 2, 3, 488, -5, 2, 11, 212}; 
            int max=arr[0]; 
            int pos=0;
            for (int i = 1; i < arr.length; i++) 
            {
               if (arr[i] >max){  
               max=arr[i]; 
               pos= i;
                
               }   
            }
            
            System.out.println("Largest element index no.: "+pos); 
             System.out.println("Largest element is: "+max);
        }
         public static void main(String[] args) {
largestarray g = new largestarray();
g.largest();
g.smallest();
        
    }
}