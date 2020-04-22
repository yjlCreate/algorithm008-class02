
public class IsAnagram{

   public boolean isAnagram(String s, String t) {
       /** 
       解法一，通过对s,t的排序，排序后相等就成立
       char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        if(String.valueOf(sChar).equals(String.valueOf(tChar))){
            return true;
        }else{
            return false;
        }**/
        //解法二：map统计法
       /* char[] schar = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char c: schar){
            if(map.containsKey(c)){
                Integer value = map.get(c);
                map.put(c,value+1);
            }else{
                map.put(c,1);
            }
            
        }
        char[] tchar = t.toCharArray();
        for(char c:tchar){
            if(!map.containsKey(c)){
                return false;
            }else{
                Integer value = map.get(c);
                if(--value == 0){
                    map.remove(c);
                }else{
                    map.put(c,value);
                }
            }
        }
        if(map.size() == 0){
            return true;
        }else{
            return false;
        }*/
         if(s.length() != t.length())
            return false;
        int[] alpha = new int[26];
        for(int i = 0; i< s.length(); i++) {
            alpha[s.charAt(i) - 'a'] ++;
            alpha[t.charAt(i) - 'a'] --;
        }
        for(int i=0;i<26;i++)
            if(alpha[i] != 0)
                return false;
        return true;

    }
}