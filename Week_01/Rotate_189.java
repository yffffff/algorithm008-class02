class Rotate_189 {
    public void rotate(int[] nums, int k) {
            int trump = k % nums.length;
            int nums_n[] = new int[trump];
            for (int i = 0; i <trump ; i ++){
                nums_n[i] = nums[nums.length - trump+i];
            }
            for (int j = nums.length - trump -1 ; 0<=j ;j--){
                nums[j+trump] = nums[j];
            } 
            for (;0<=trump-1;trump--){
                nums[trump-1] = nums_n[trump-1];
            }
    }
}