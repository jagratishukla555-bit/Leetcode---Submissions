class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hash1 = new HashMap<>();
        for(int i=0; i<nums1.length; i++)
        {
            hash1.put(nums1[i], hash1.getOrDefault(nums1[i],0)+1);
        }
        HashSet<Integer> arr = new HashSet<>();
        for(int i=0; i<nums2.length; i++)
        {
            if(hash1.containsKey(nums2[i]))
            {
                arr.add(nums2[i]);
            }
        }

        int[] res = new int[arr.size()];
        int index=0;
        for(int i: arr)
        {
            res[index++] = i;
        }
        return res;
    }
}