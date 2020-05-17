class MySqrt_69 {
    public int mySqrt(int x) {
        long l = 0;
        long r = x;
        long mid = 0 ;
        while ( l < r ){
            mid = (l+r +1 ) >>>1;
            if ( mid*mid > x ){
                r = mid - 1 ;
            }else{
                l = mid ;
            }
        }
        return (int)l;
    }
}