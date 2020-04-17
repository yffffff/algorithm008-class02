class SortedSquares_977 {
    public int[] sortedSquares(int[] A) {
        int right = A.length-1 ;
        int left = 0;
        int B[] = new int[A.length];
        for ( int i = A.length -1 ; i >= 0  ; i-- ){
            if ( Math.abs(A[left]) >= Math.abs(A[right]) ){
                B[i] = A[left]*A[left];
                left++;
            }else{
                B[i] = A[right]*A[right];
                right--;
            }
        }
        return B;
    }
}