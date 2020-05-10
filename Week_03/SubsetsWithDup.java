public class SubsetsWithDup{

   public List<List<Integer>> subsetsWithDup(int[] nums) {
      List<List<Integer>> res = new ArrayList<>();
       if( nums == null || nums.length == 0){
           return res;
       }
       Arrays.sort(nums);
       Deque<Integer> path = new ArrayDeque<>();
       dfs( nums,path,0,0,res);
       return res;
    }
    
    private void dfs(int[] nums, Deque<Integer> path,int level,int index,List<List<Integer>> res
     ){

      res.add(new ArrayList(path));
     for(int i = index ;i<nums.length;i++){
       //需要进行相应的剪枝处理
         if( i> index && nums[i] == nums[i-1] ){
             continue;
         }
         path.addLast(nums[i]);
         dfs(nums,path,level+1,i+1,res);
         path.removeLast();
       
      
     }

    }

}