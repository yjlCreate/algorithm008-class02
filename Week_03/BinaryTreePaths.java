public class  BinaryTreePaths{
public List<String> binaryTreePathsTest(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root == null){
          return res;
        }
        dfs(root,res,"");
        return res;
    }

    public void dfs(TreeNode root, List<String> res,String path){
        if(root == null){
            return ;
        }else{
             path += String.valueOf(root.val);
        
         if(root.left == null && root.right == null){
             res.add(path);
             return;
         }
          path =path+"->";
         dfs(root.left,res,path);
         dfs(root.right,res,path);

        }
        
    }
	}