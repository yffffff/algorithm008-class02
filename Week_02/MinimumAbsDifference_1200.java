class MinimumAbsDifference_1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = arr[arr.length-1]-arr[0];
        for (int i =1; i < arr.length;i++){
            min = Math.min(min,arr[i]-arr[i-1]);
        }
        List<List<Integer>> l = new ArrayList<>();    
        for (int i =1 ;i < arr.length ; i++){
            List<Integer> inner = new ArrayList<>();
            if (min == arr[i]-arr[i-1]){
                inner.add(arr[i-1]);
                inner.add(arr[i]);
                l.add(inner);
            }     
        }
        return l;
    }
}