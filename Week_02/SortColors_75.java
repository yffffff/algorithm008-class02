class SortColors_75 {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int curr =0;
        while ( curr <= right ){
            if (nums[curr]==0){
                swap(curr,left,nums);
                left++;
                curr++;
            }else if(nums[curr]==2){
                swap(curr,right,nums);
                right--;
            }else{
                curr++;
            }
        }
    }

    public void swap(int a,int b,int[] num){
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
}