public class CombinationSum3{

    /**
      问题的思考角度转化：k表示树高，n表示一条路径的和
      所以每一子节点都可以选（1-9）
      要求每个节点不能有重复的数字，每次递归的时候采用下标叠加即begin+1
    **/
    public List<List<Integer>> combinationSum3Method(int k, int n) {
       List<List<Integer>> res = new ArrayList<>();
       if( k ==  0){
           return res;
       }
       Deque<Integer> path = new ArrayDeque<Integer>();
       dfs(k,n,1,res,path,0);
       return res;


    }
    public void dfs(int k,int n,int begin,List<List<Integer>> res,Deque<Integer> path,int depth){
       if(depth == k){
        if(n == 0) {res.add(new ArrayList(path));}
         return;
       }
       for(int i = begin;i<= 9;i++){
           n = n -i;
           path.addLast(i);
           dfs(k,n,i+1,res,path,depth+1);
           path.removeLast();
           n = n+i;
       }
    }
}