class ReplaceSpace_M05 {
    public String replaceSpace(String s) {
		char[] str = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : str){
            if (c == ' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}