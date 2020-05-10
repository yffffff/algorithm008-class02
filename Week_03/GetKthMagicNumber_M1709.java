class GetKthMagicNumber_M1709 {
    public int getKthMagicNumber(int k) {
    int p3=0,p5=0,p7=0;
    int[] result=new int[k];
    result[0]=1;
    for(int i=1;i<k;i++){
        result[i]=Math.min(result[p3]*3,Math.min(result[p5]*5,result[p7]*7));
        if(result[i]==result[p3]*3) p3++;
        if(result[i]==result[p5]*5) p5++;
        if(result[i]==result[p7]*7) p7++; 
    }
    return result[k-1];
    }
}