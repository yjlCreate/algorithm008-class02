public calss LevelOrder{

 public List<List<Integer>> levelOrder(Node root) {
        //层序遍历借助queue的特性来解题比较容易理解；FIFO
        //第一步：root节点入queue
        List<List<Integer>> result = new ArrayList<>(); //定义返回的结果集
        if(root == null ){
             return result;
        }
        Queue<Node> queue = new LinkedList<Node>();
        //root节点入队列
        queue.offer(root);
        // 循环的终止条件，queue为空
        int levelCount = 1;
        int chiledCount = 0;
        while(!queue.isEmpty()){
              // 取出节点
              chiledCount = 0;
              List<Integer> tempResult = new ArrayList<>();
              for(int i = 0;i<levelCount;i++){
                  Node node = queue.poll();
                  tempResult.add(node.val);
                  for(Node chiled: node.children){
                     chiledCount++;
                     queue.offer(chiled);
                  }
              }
              levelCount = chiledCount;
              result.add(tempResult);

        }
        return  result;
    }
	
	//执行结果，才击败60%的；有优化的空间，暴露问题对层次遍历不熟


}