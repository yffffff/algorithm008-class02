class removeOuterParentheses_1021 {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int check = 0;
        char[] c_l = S.toCharArray();
        for (char c : c_l){
            if ( c==')'){
                check = check -1 ;
            }
            if (check >0){
                sb.append(c);
            }
            if ( c =='('){
                check +=1; 
            }
        }
        return sb.toString();
    }
}