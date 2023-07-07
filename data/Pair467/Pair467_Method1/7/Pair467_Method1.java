import java.util.*;

public class Target {

int[] ensureCapacity(int[] array,int minCapacity){
  int oldCapacity=array.length;
  int[] newArray;
  if (minCapacity > oldCapacity) {
    int newCapacity=(oldCapacity * 3) / 2 + 1;
    if (newCapacity < minCapacity) {
      newCapacity=minCapacity;
    }
    newArray=new int[newCapacity];
    System.arraycopy(array,0,newArray,0,oldCapacity);
  }
 else {
    newArray=array;
  }
  return newArray;
}
  int[] __target__(int[] array,int minCapacity){
  int oldCapacity=array.length;
  int[] newArray;
  if (minCapacity <= oldCapacity) {
    int newCapacity=(oldCapacity * 3) / 2 + 1;
    if (newCapacity < minCapacity) {
      newCapacity=minCapacity;
    }
    newArray=new int[newCapacity];
    System.arraycopy(array,0,newArray,0,oldCapacity);
  }
 else {
    newArray=array;
  }
  return newArray;
}

}