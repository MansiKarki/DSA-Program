class Averagenumber{
    
  
    static double average(int a[], int n)
    {
        
      
        int sum = 0;
        
        for (int i = 0; i < n; i++)
            sum = sum + a[i];
    
        return (double)sum / n;
    }
    
      public static void main (String[] args)
    {
        
        int arr[] = {10, 20,30,40,50,80,79,45};
        int n = arr.length;
    
        System.out.println(average(arr, n));
    }
}
