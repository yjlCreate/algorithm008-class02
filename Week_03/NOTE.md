一、课堂笔记
   1） java 递归模板方案
   public void recur(int level, int param) { 
      // terminator 
     if (level > MAX_LEVEL) { 
       // process result 
       return; 
     }
     // process current logic 
     process(level, param); 
     // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
 
}
