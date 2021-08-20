class Solution {
    public int firstMissingPositive(int[] num) {
        int max = 0;
        int numFound = -1;
        Map<Integer,Integer> h1 = new HashMap<Integer,Integer>();
        for(int i=0; i < num.length; i++) {
            if(num[i]>=0) {
                Integer val = h1.get(num[i]);
                if(val == null) {
                    h1.put(num[i],1);
                } else {
                    h1.put(num[i],h1.get(num[i])+1);  
                }
            }
            if(num[i]>= max) {
                max = num[i];
            }
        }
        System.out.println(max);
numFound = max+1;       
 if(max > 0) {
      for(int i=1; i <=max; i++) {
          Integer val = h1.get(i);
          if(val == null){
              numFound = i;
              break;
          }
      }
 }
                           return numFound;
   
}
}
