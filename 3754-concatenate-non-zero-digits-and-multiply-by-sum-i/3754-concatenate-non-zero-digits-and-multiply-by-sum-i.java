class Solution {
    public long sumAndMultiply(int n) {
      
    long num = n;
    long rem = 0;
    long dig = 0;
    long sum =0;
      while(num!=0){
        rem = num%10;
        if(rem !=0)
        {
            dig = dig*10 + rem;
            sum+=rem;
        }
        num = num/10;
      }
      long d = dig;
      long newdig=0;
      while(d !=0)
      {
        rem = d%10;
        newdig = newdig*10 + rem;
        d=d/10;
      }
      return newdig*sum;
}
}