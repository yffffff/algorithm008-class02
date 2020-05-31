class Combine_77 {

    private  List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if (n <= 0 || n < k  ){
            return res;
        }
        hs(n, k, 1, new Stack<>());
        return res;
    }
    
    public void hs(int n, int k, int deep , Stack<Integer> s){
        if (s.size() == k){
            res.add(new ArrayList<>(s));
            return ;
        }
        for (int i = deep ; i <= n - (k - s.size())+1 ; i++){
            s.push(i);
            hs(n, k, i + 1, s);
            s.pop();
        }

    }
}