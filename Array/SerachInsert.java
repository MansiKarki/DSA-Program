class SerachInsert {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        SerachInsert obj = new SerachInsert();
        int[] arr = {1, 3, 5, 6,7,8,9};
        int target1 = 5;
        System.out.println("Insert position for 5: " + obj.searchInsert(arr, target1));
    }
}
