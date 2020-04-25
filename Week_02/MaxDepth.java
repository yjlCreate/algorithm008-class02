public class MaxDepth{

      /*
      1) 理解二叉树的深度的定义:深度为根节点到最远叶子节点的最长路径上的节点数;
      2) 如果只有一个root根节点，那么这个深度为1;
      3) 才用层次遍历，获取最后一层，最后一层的数便是最大的深度（那么就是模板化的编程了）
         采用：BFS
     ----------------------------------------------------------------------------------------


    */
    public int maxDepth(TreeNode root) {
       //第一步：参数的检验
       if(root == null ){
         return 0;
       }
       int level = 0;
       Queue<TreeNode> queue = new LinkedList<TreeNode>();
       queue.offer(root);
       while( !queue.isEmpty()){
           int size  = queue.size();
           for(int i = 0;i<size;i++){
               TreeNode node = queue.poll();
               if(node.left != null ) queue.offer(node.left);
               if(node.right != null ) queue.offer(node.right);
           }
           level++;

       }
       return level;

    }


}