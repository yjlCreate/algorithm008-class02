public Class RotateArray{

   /**
   只是相当于循环了一遍n
   **/
   public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
			/**
			 比如  1，2，3，4，5，6，7 k=2;
			 开始的时候：start = 0
			 prev = 1；
			 next = 2  --->缓存temp = 3
			 num[2] =  1; --->prev = 3
			 current = 2;count= 1;
			 下一跳跳到5；最后到1，这start = current 跳出do则nums[0] = 6
			 
			**/
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

}