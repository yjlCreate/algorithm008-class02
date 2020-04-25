public class GetLeastNumbers{

 
 public int[] getLeastNumbers(int[] arr, int k) {
         //这个实现有点慢，才打败33%
          if( k == 0 || arr == null ){
             return new int[]{};
         }  
         if(arr != null && arr.length <= k){
             return arr;
         } 
		 /*
         PriorityQueue<Integer> queue =  new PriorityQueue<Integer>(k);
         int[] result = new int[k];
         for(Integer cur:arr){
            queue.offer(cur);
         }
         for(int j =0;j<k;j++){
            result[j] = queue.poll();
         }
         return result;*/
		 
		 //方法二：击败64% 采用的是先排序，然后取出前K个
		  //采用先排序，然后找出最小的个数
         Arrays.sort(arr);
         int[] result = new int[k];
         for(int i = 0;i<k;i++){
              result[i] = arr[i];
             
         }
         return result;
		 
		 //后期使用快排优化
    }

}