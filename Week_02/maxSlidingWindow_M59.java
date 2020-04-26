class maxSlidingWindow_M59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0){return nums;}
		int index = 0;
        int[] res = new int[nums.length - k + 1];
        LinkedList<Integer> qMax = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            while (!qMax.isEmpty() && nums[qMax.peekLast()] <= nums[i]) {
                qMax.pollLast();
            }
            qMax.addLast(i);
            if (qMax.peekFirst() == (i - k)) {
                qMax.pollFirst();
            }
            if (i >= (k - 1)) {
                res[index++] = nums[qMax.peekFirst()];
            }
        }
        return res;
    }
}