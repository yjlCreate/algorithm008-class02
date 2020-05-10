public class LetterCombinations{

  public List<String> letterCombinations(String digits) {
        
        Map<String,String> map = new HashMap<>();
        map.put("2","abc"); 
        map.put("3","def"); 
        map.put("4","ghi"); 
        map.put("5","jkl"); 
        map.put("6","mno"); 
        map.put("7","pqrs"); 
        map.put("8","tuv"); 
        map.put("9","wxyz"); 
        List<String> res = new ArrayList<>();
        if("".equals(digits) || digits == null){
            return res;
        }
        char[] ss = digits.toCharArray();
        dfs(res,ss,0,map,0,new StringBuilder());
        return res;


    }
    private void dfs(List<String> res,char[] ss, int index ,Map<String,String> map ,int level,StringBuilder str){

       if(ss.length == level){
       	  res.add(str.toString());
          return;
       }
       for( int i = index ;i<ss.length;i++ ){
           String word = map.get(String.valueOf(ss[i]));
           char[] wordChar = word.toCharArray();
           for(int j = 0;j<wordChar.length;j++){
           	    str.append(wordChar[j]);
           	    dfs(res,ss,i+1,map,level+1,str); 
                str.deleteCharAt(str.length()-1);                          
           }
       }
    }
}