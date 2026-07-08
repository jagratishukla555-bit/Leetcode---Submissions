class Solution {

    public boolean checkVowel(char ch)
    {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public String reverseVowels(String s) {
        int n = s.length();
        char[] words = s.toCharArray(); 

        int left = 0, right = n-1;

        while(left < right)
        {
            if(!checkVowel(words[left]))
            {
                left++;
            }
            else if(!checkVowel(words[right]))
            {
                right--;
            }
            else if(checkVowel(words[left]) && checkVowel(words[right]))
            {
                char ch = words[left];
                words[left] = words[right];
                words[right] = ch;
                left++;
                right--;
            }
            else{
                left++;
                right--;
            }
        }
        s = new String(words);
        return s;
    }
}