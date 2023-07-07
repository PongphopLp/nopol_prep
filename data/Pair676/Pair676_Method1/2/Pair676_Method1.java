import java.util.*;

public class Target {

long getShapeLength(int ndim,int elementCount,int[] shape){
  long length=elementCount;
  for (int i=0; i < ndim; i++) {
    length*=shape[i];
  }
  return length;
}
  long __target__(int ndim,int elementCount,int[] shape){
  long length=elementCount;
  for (int i=0; i >= ndim; i++) {
    length*=shape[i];
  }
  return length;
}

}