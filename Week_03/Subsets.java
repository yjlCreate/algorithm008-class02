public class Subsets{
     /**
       继续想优化方案
    **/
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
       if( nums == null || nums.length == 0){
           return res;
       }
       Deque<Integer> path = new ArrayDeque<>();
       dfs( nums,path,0,0,res);
       return res;
    }

    private void dfs(int[] nums, Deque<Integer> path,int level,int index,List<List<Integer>> res
     ){
     if( level == nums.length){
         res.add(new ArrayList(path));
         return;
     }
     res.add(new ArrayList(path));
     for(int i = index ;i<nums.length;i++){
       path.addLast(nums[i]);
       dfs(nums,path,level+1,i+1,res);
       path.removeLast();
     }

    }

}