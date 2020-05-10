class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        Map<Integer ,Integer> map = new HashMap<Integer ,Integer>();
        for ( int i = 0 ;  i < nums.length ; i++){
            if ( map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        Map.Entry<Integer,Integer> max_entry = null;
        for ( Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (max_entry == null || entry.getValue() > max_entry.getValue()){
                max_entry = entry;
            }
        }
        return max_entry.getKey();
    }
}