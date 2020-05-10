public class Permute{

public List<List<Integer>> permute(int[] nums) {
       
       if(nums == null){
           return null;
       }
       List<List<Integer>> res = new ArrayList<>();
       boolean[] userd = new boolean[nums.length];
       for(int i =0 ;i<nums.length ;i++){
          userd[i] = false;
       }
       doPermute(0,userd,res,nums,new ArrayList<Integer>(),nums.length);
       return res;
    }
    public void doPermute(int depth,boolean[] userd,List<List<Integer>> res,int[] nums,
                             List<Integer> path,int len){
      
      if(depth == len){
         res.add(new ArrayList<>(path)); 
         return;
      }
      for(int i = 0;i<len;i++){
         if(!userd[i]){
             userd[i] = true;
             path.add(nums[i]);
             doPermute(depth+1,userd,res,nums,path,len);
             userd[i]  = false;
             path.remove(path.size() - 1);
                     
          }
      }
    }
}