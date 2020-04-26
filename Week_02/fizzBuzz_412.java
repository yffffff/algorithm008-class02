class fizzBuzz_412 {
    public List<String> fizzBuzz(int n) {
        HashMap<Integer,String> hp = new HashMap<Integer,String>();
        hp.put(3,"Fizz");
        hp.put(5,"Buzz");
        List<String> s_l = new ArrayList();
        for (int i =1 ; i <= n ; i++){
            String new_str = "";
            for (Integer key : hp.keySet() ){
                if (i % key ==0){
                    new_str +=hp.get(key);
                }
            }
            if (new_str == "") {
                new_str = String.valueOf(i);
            }
            s_l.add(new_str);
        }
        return s_l;
    }
}