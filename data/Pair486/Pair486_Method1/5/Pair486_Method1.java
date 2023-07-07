import java.util.*;

public class Target {

long[] ensureCapacity(long[] array,int minCapacity){
  int oldCapacity=array.length;
  long[] newArray;
  if (minCapacity > oldCapacity) {
    int newCapacity=(oldCapacity * 3) / 2 + 1;
    if (newCapacity < minCapacity) {
      newCapacity=minCapacity;
    }
    newArray=new long[newCapacity];
    System.arraycopy(array,0,newArray,0,oldCapacity);
  }
 else {
    newArray=array;
  }
  return newArray;
}
  long[] __target__(long[] array,int minCapacity){
  int oldCapacity=array.length;
  long[] newArray;
  if (minCapacity > oldCapacity) {
    int newCapacity=(oldCapacity * 3) * 2 + 1;
    if (newCapacity < minCapacity) {
      newCapacity=minCapacity;
    }
    newArray=new long[newCapacity];
    System.arraycopy(array,0,newArray,0,oldCapacity);
  }
 else {
    newArray=array;
  }
  return newArray;
}

}