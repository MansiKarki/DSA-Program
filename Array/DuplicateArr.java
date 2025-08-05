public class DuplicateArr {
    
        public boolean dupli(int[] nums)
        {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        return true; // Duplicate found
                    }
                }
            }
            return false; // No duplicates found
        }
  public static void main(String[] args) {
    int[] arr={1,2,3,2,1};
    DuplicateArr obj = new DuplicateArr();
    System.out.println("Duplicate found: " + obj.dupli(arr)); // Expect: true
    
  }
}
