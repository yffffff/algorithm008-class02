class IsSubsequence_392 {
    public boolean isSubsequence(String s, String t) {
        char[] s_l = s.toCharArray();
        char[] t_l = t.toCharArray();
        int b = 0;
        if (s_l.length == 0 ){
            return true;
        }
        for (int i=0;i<t_l.length;i++){
            if( t_l[i] == s_l[b] ){
                b++;
                if (b == s_l.length){
                    return true;
                }
            }
        }
        return false;
    }
}