class MinMutation_433 {
    int min_count = Integer.MAX_VALUE;
    public int minMutation(String start, String end, String[] bank) {
        dfs(new HashSet<String>(),0,start,end,bank);
        return ( min_count == Integer.MAX_VALUE ) ? -1 : min_count ;
    }

    private void dfs ( HashSet<String> step , int step_now, String start, String end, String[] bank){
        if ( step_now >= min_count ) {
            return;
        }
        if ( start.equals(end) ){
            min_count = Integer.min( min_count, step_now );
            return;
        }
        for ( String str : bank ){
            if ( step.contains(str) ){
                continue;
            }
            int diff = 0;
            for ( int j = 0; j < str.length() ; j++ ){
                if ( start.charAt(j) != str.charAt(j) ){
                    if (++diff > 1) break;
                }
            }
            if ( diff == 1 ){
                step.add(str);
                dfs( step, step_now+1 , str, end,bank);
                step.remove(str);
            }
            
        }
    }
}