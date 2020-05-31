class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int fund_5 = 0 ;
        int fund_10 = 0;
        for( int i = 0 ; i<= bills.length -1 ; i++){
             switch(bills[i]){
                 case 5 : fund_5 ++ ; break;
                 case 10: fund_5 -- ;fund_10++;break;
                 case 20:{
                     if (fund_10 > 0 ){
                         fund_10--;
                         fund_5--;
                     }else{
                         fund_5 -=3;
                     }
                 }
                 break;
             }
             if (fund_5 < 0){
                 return false;
             }
        }
        return true;
    }
}