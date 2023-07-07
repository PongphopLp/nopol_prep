import java.util.*;

public class Target {

int[] deleteArrayInt(int[] vals,int idx){
  int[] newVals=new int[vals.length - 1];
  if (idx > 0) {
    System.arraycopy(vals,0,newVals,0,idx);
  }
  if (idx < newVals.length) {
    System.arraycopy(vals,idx + 1,newVals,idx,newVals.length - idx);
  }
  return newVals;
}
  int[] __target__(int[] vals,int idx){
  int[] newVals=new int[vals.length + 1];
  if (idx > 0) {
    System.arraycopy(vals,0,newVals,0,idx);
  }
  if (idx < newVals.length) {
    System.arraycopy(vals,idx + 1,newVals,idx,newVals.length - idx);
  }
  return newVals;
}

}