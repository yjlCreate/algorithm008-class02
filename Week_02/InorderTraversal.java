public class InorderTraversal{
  
  /**
    中序遍历：常用的模板代码
	解决方案：
	1) 当要返回结果集的时候： List<Integer> result
	2）在定义一个递归方法
	3）ok
	【4月25再回顾】
  **/
   public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        interorTree(result,root);
        return result;
    }

    private void interorTree(List<Integer> result,TreeNode root){
        if( root == null){
            return;
        }
        interorTree(result,root.left);
		/**
		  这里相当于自己的业务逻辑
		**/
        result.add(root.val);
        interorTree(result,root.right);

    }


}