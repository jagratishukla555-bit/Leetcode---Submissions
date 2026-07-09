class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        int left = 0, right = 0;
        int maxSub =0;
        for(right=0; right<s.length(); right++)
        {
            char ch = s.charAt(right);
            if(hash.containsKey(ch)){
            left = Math.max(left, hash.get(ch) + 1);
            }
            hash.put(ch, right);
            maxSub = Math.max(maxSub, right-left+1);
        }
        return maxSub;
    }
}