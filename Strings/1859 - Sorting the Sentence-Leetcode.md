####Leetcode
##[1859 - Sorting the Sentence](https://leetcode.com/problems/sorting-the-sentence/description/)


```
	class Solution {
    public String sortSentence(String s) {
        
    String[] pos=new String[10];

    for(int i=0;i<s.length();i++){
        int j=i;
        StringBuilder temp=new StringBuilder();
        while(!Character.isDigit(s.charAt(j))){
            temp.append(s.charAt(j));
            j++;
        }

        pos[s.charAt(j)-'0'] = temp.toString();
        i=j+1;
    }
    StringBuilder ans=new StringBuilder();
    for(int i=1;i<10;i++){
        if(pos[i]!=null && pos[i].length()>0){
            ans.append(pos[i]).append(' ');
        }
    }

    if(ans.length()>0 && ans.charAt(ans.length()-1)==' '){
        ans.deleteCharAt(ans.length()-1);
    }

    return ans.toString();
    }
}
```