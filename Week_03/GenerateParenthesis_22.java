class GenerateParenthesis_22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        if (n == 0 ) {
            return list;
        }
        dfs("",0,0,n,list);
        return list;
    }

    public void dfs(String str,int left , int right,int n ,List<String> list){
        if ( left == n && right == n ){
            list.add(str);
            return;
        }
        if (left < right || left > n || right > n){
            return;
        }
        dfs(str + "(",left+1,right,n,list);
        dfs(str + ")",left,right+1,n,list);
        return;
    }
}