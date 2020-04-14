class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        for ( int i = digits.length - 1 ; 0 <= i ; i--){
            if ( digits[i] < 9 ){
                digits[i] = digits[i] + 1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        digits = new int[ digits.length + 1 ];
        digits[0] = 1;
        return digits;
    }
}