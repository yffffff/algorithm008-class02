class ZeroMove_283 {
    public void moveZeroes(int[] nums) {
        if (  nums == null  ){
            return ;
        }
        int zero_locate=0 ;

        for (int n = 0 ; n < nums.length ;  n++ ){
            if ( nums[n] != 0 ){
                nums[zero_locate++] = nums[n];
            }
        }

        for(int n=zero_locate ; n<nums.length ; n++){
            nums[n] = 0 ;
        }
    }
}