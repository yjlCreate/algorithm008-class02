public class MinDepth{

 /*
       采用DFS
       记录最小值
       实质就是用递归：定义一个递归

    */
    public int minDepth(TreeNode root) {
      if(root == null ){
         return 0;
      }
      List<Integer> minDepthList  = new ArrayList<>() ;
      doMinDepth(root,0,minDepthList);
      Collections.sort(minDepthList);
      return minDepthList.get(0);
    }

    private void doMinDepth(TreeNode node,int minDepth, List<Integer> minDepthList){
       minDepth++;
       if(node.left == null && node.right == null) {
           int temp = minDepth;
           minDepthList.add(temp);
           minDepth--;
           return ;
       } 
       if(node.left != null){
           doMinDepth( node.left , minDepth, minDepthList);
       }
       if(node.right != null){
           doMinDepth( node.right, minDepth, minDepthList);
       }
      
    }
}