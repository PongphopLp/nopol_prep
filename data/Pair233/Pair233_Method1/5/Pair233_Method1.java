import java.util.*;

public class Target {

boolean increment(int[] indices,int[] dimensions){
  for (int indexPtr=indices.length - 1; indexPtr >= 0; indexPtr--) {
    if (indices[indexPtr] < dimensions[indexPtr] - 1) {
      indices[indexPtr]+=1;
      return true;
    }
 else {
      indices[indexPtr]=0;
    }
  }
  return false;
}
  boolean __target__(int[] indices,int[] dimensions){
  for (int indexPtr=indices.length - 1; indexPtr < 0; indexPtr--) {
    if (indices[indexPtr] < dimensions[indexPtr] - 1) {
      indices[indexPtr]+=1;
      return true;
    }
 else {
      indices[indexPtr]=0;
    }
  }
  return false;
}

}