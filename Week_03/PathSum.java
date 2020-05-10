public class PathSum{
    
 public List<List<Integer>> pathSumMethod(TreeNode root, int sum) {

   
      Deque<Integer> path = new ArrayDeque<>();
      List<List<Integer>> res = new ArrayList<>();
      if(root == null ){
          return res;
      }
      doPathSum(root,sum,0,path,res);
      return res;
    }

    public void doPathSum(TreeNode root, int sum,int count,Deque<Integer> path,List<List<Integer>> res){
        if( root == null){
           return;
        }
        count = count+root.val;
        path.addLast(root.val);
        doPathSum(root.left,sum,count,path,res);
        doPathSum(root.right,sum,count,path,res);
        if(count == sum && root.left == null && root.right == null){
           res.add(new ArrayList<>(path));
        }
        count = count - root.val;
         path.removeLast();

    }

}