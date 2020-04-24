public class PreorderTraversal{
   public List<Integer> preorderTraversal(TreeNode root) {
      //采用模板的方式
      // 一定义一个结果集
      List<Integer> result = new ArrayList<>();
      if(root == null ){
          return result;
      }
      // 定义一个递归体
      traversal(root,result);
      return result;
    }

    private void traversal(TreeNode root,List<Integer> result){
         if(root == null){
             return;
         }
         //前序遍历的话：业务操作放在第一位
         result.add(root.val);
         traversal(root.left,result);
         traversal(root.right,result);
    }

}