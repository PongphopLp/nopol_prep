import java.util.*;

public class Target {

long arrayLength(int ndim,int elementCount,int[] lengths){
  long arrayLength=elementCount;
  for (int i=0; i < ndim; i++)   arrayLength*=lengths[i];
  return arrayLength;
}
  long __target__(int ndim,int elementCount,int[] lengths){
  long arrayLength=elementCount;
  for (int i=0; i < ndim; i--)   arrayLength*=lengths[i];
  return arrayLength;
}

}