class IsAnagram_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char[] s_l = s.toCharArray();
        char[] t_l = t.toCharArray();
        int[] hash = new int[26];
        for (int i=0 ; i < s.length();i++){
            hash[ s_l[i]-'a']++;
            hash[ t_l[i]-'a']--;
        }
        for (int i :hash){
            if (i<0){
                return false;
            }
        }
        return true;
    }
}