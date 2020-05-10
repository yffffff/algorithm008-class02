class AddStrings_415 {
    public String addStrings(String num1, String num2) {
        StringBuilder st = new StringBuilder("");
        int i = num1.length()-1;
        int j = num2.length()-1;
        int temp = 0;
        int res = 0;
        while (i>=0 || j>=0 ){
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            temp = n1 + n2 + res;
            res = temp / 10 ;
            st.append(temp % 10);   
            i--;
            j--; 
        }
        if (res == 1){
            st.append(res);
        }
        return st.reverse().toString();
    }
}