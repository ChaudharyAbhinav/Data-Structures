### [Non Repeating Character](https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab)


```
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        
        HashMap<Character,Integer> map=new HashMap<>();
        int size = S.length();
        
        for(int i=0;i<size;i++){
            map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
        }
        
        for(int i=0;i<size;i++){
            if(map.get(S.charAt(i))==1){
               return S.charAt(i); 
            }
        }
     z   
        return '$';
    }
}

```



![Solution](https://drive.google.com/uc?id=1neOObUz8WMjhiVNhmPJilHxEXJYO6n27)