import java.util.*;

public class Target {

int arrayIndexOf(byte[] array,byte value,int fromIndex){
  while (fromIndex < array.length) {
    if (array[fromIndex] == value)     return fromIndex;
 else     fromIndex++;
  }
  return -1;
}
  int __target__(byte[] array,byte value,int fromIndex){
  while (fromIndex >= array.length) {
    if (array[fromIndex] == value)     return fromIndex;
 else     fromIndex++;
  }
  return -1;
}

}