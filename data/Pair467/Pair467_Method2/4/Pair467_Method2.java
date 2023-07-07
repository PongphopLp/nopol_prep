import java.util.*;

public class Target {

int[] ensureCapacity(int[] array,int minCapacity){
  int oldCapacity=array.length;
  if (minCapacity > oldCapacity) {
    int[] oldData=array;
    int newCapacity=(oldCapacity * 3) / 2 + 1;
    if (newCapacity < minCapacity)     newCapacity=minCapacity;
    int[] copy=new int[newCapacity];
    System.arraycopy(array,0,copy,0,Math.min(oldData.length,newCapacity));
    return copy;
  }
  return array;
}
  int[] __target__(int[] array,int minCapacity){
  int oldCapacity=array.length;
  if (minCapacity > oldCapacity) {
    int[] oldData=array;
    int newCapacity=(oldCapacity * 3) / 2 - 1;
    if (newCapacity < minCapacity)     newCapacity=minCapacity;
    int[] copy=new int[newCapacity];
    System.arraycopy(array,0,copy,0,Math.min(oldData.length,newCapacity));
    return copy;
  }
  return array;
}

}