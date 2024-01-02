####Leetcode
##[409-Longest Palindrome](https://leetcode.com/problems/longest-palindrome/description/)


```
class Solution {
    public int longestPalindrome(String s) {
         int[] count =new int[128];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        int oddCount=0;
        for(int v: count) {
            if(v%2!=0) oddCount++;
        }


        return (oddCount==0)? s.length() : (s.length()-oddCount+1);
    }
}
```