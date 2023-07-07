import java.util.*;

public class Target {

long[] ensureCapacity(long[] array,int minCapacity){
  int oldCapacity=array.length;
  if (minCapacity > oldCapacity) {
    long[] oldData=array;
    int newCapacity=(oldCapacity * 3) / 2 + 1;
    if (newCapacity < minCapacity)     newCapacity=minCapacity;
    long[] copy=new long[newCapacity];
    System.arraycopy(array,0,copy,0,Math.min(oldData.length,newCapacity));
    return copy;
  }
  return array;
}
  long[] __target__(long[] array,int minCapacity){
  int oldCapacity=array.length;
  if (minCapacity > oldCapacity) {
    long[] oldData=array;
    int newCapacity=(oldCapacity / 3) / 2 + 1;
    if (newCapacity < minCapacity)     newCapacity=minCapacity;
    long[] copy=new long[newCapacity];
    System.arraycopy(array,0,copy,0,Math.min(oldData.length,newCapacity));
    return copy;
  }
  return array;
}

}