class Jump_45 {
    public int jump(int[] nums) {
        int len = nums.length;
        int start = 0;
        int end = 0;
        int maxposition = 0;
        int step = 0;
        for (int i = 0 ; i < len-1 ;i++){
            maxposition = Math.max(maxposition , i+ nums[i] );
            if (end == i){
                end = maxposition;
                step++;
                if (maxposition >= len-1 ){
                    break;
                }
            }
        }
        return step;
    }
}