class Solution {
    public long getValue(int n){
        int num = n;
        int rem = 0;
        int nextVal = 0;
        while(num !=0){
        rem = num%10;
        nextVal = nextVal + rem*rem;
        num = num/10;
        }    
        return nextVal;
    }

    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();
        int nextVal = n;

        while (nextVal != 1 && !set.contains(nextVal)) {
        set.add(nextVal);
        nextVal = (int)getValue(nextVal);
        }

        return nextVal == 1;

    }
}