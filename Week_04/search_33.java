class search_33 {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1 ;
        int mid = 0;
        while ( l <= r ){
            mid = (r+l)/2;
            if ( nums[mid] == target){
                return mid;
            }
            if ( nums[r] >= nums[mid]  ){
                if ( target > nums[mid] && nums[r] >= target){
                    l = mid +1 ;
                }else{
                    r = mid -1 ;
                }
            }else{
                if ( target >= nums[l] &&  nums[mid] > target ){
                    r = mid -1;
                }else{
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}