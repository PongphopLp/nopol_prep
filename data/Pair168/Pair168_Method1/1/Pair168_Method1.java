import java.util.*;

public class Target {

int lastIndexOf(byte[] array,byte target,int start,int end){
  for (int i=end - 1; i >= start; i--) {
    if (array[i] == target) {
      return i;
    }
  }
  return -1;
}
  int __target__(byte[] array,byte target,int start,int end){
  for (int i=end + 1; i >= start; i--) {
    if (array[i] == target) {
      return i;
    }
  }
  return -1;
}

}