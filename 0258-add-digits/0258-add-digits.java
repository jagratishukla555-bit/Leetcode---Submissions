class Solution {

    public int getSum(int num) {
        int n = num;
        int rem = 0;
        int sum = 0;
        while(n!=0)
        {
            rem = n%10;
            sum+=rem;
            n = n/10;
        }
        
        return sum;
    }

    public int addDigits(int num) {
        int res = getSum(num);
        while(res>=10)
        {
            res = getSum(res);
        }
       
        return res;
    }

}