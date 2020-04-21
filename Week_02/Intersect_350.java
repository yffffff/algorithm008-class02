class Intersect_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }
        HashMap<Integer , Integer> h = new HashMap<>();
        for (int n : nums1){
            h.put(n,h.getOrDefault(n,0)+1 );
        }
        int k = 0;
        for (int n:nums2){
            int target = h.getOrDefault(n,0);
            if( target > 0){
                nums1[k++] = n;
                h.put(n,target-1);
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}