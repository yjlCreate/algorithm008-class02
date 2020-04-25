public class TopKFrequent{

   //O(1) < O(logn) < O(n) < O(nlogn) < O(n^2) < O(n^3) < O(2^n)
   
   /*
      解题思路1：以数值为key，次数为value做一个同统计，那么最后只需要在这个的统计同，在
      结合堆排序，这个特点思路清晰
      拿出前k个的元素【】
   
      解题思路2：桶排序

    */
    public int[] topKFrequent(int[] nums, int k) {
       //先使用使用hash，统计每个数出现的频率
       Map<Integer,Integer> map = new HashMap<>();
       for(Integer i : nums){
         if(map.containsKey(i)){
             map.put(i,map.get(i)+1);
         }else{
             map.put(i,1);
         }
       }
       //使用大顶堆排序
       PriorityQueue<Point> queue = new PriorityQueue<Point>(k,new Comparator<Point>(){
           @Override
          public int compare(Point i1,Point i2){
             return i2.value-i1.value;
           }
       });
       //定义返回的结果集
     int[] result = new int[k];
     for (Integer key : map.keySet()){
        queue.offer(new Point(key,map.get(key)));
     }
     int i =0;
     while(!queue.isEmpty() && i<k){
         result[i] = queue.poll().key;
         i++;
     }
     return result;
    }

      private class Point {
         public int key;
         public int value;

         public Point(int key,int value){
             this.key = key;
             this.value = value;
         }
      }



}