public class MaxArea{
     /**
	 
	 11. 盛最多水的容器
	 
	 **/
    // solution 左右夹逼法则,前移的原则
    public int maxArea(int[] height) {

    	if( height == null ||  height.length == 1){
           return 0;
    	}
    	int i = 0;
    	int j = height.length-1;
    	int max = 0;
    	while( i < j){
          max = Math.max(max,(j-i)*Math.min(height[i],height[j]));
          if(height[i] >= height[j]){
              j--;
          }else{
            i++;
          }
    	}
    	return max;
    
    }

}