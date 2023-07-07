import java.util.*;

public class Target {

int indexOf(int[] array,int start,int end,int element){
  for (int i=start; i < end; i++) {
    if (element == array[i]) {
      return i;
    }
  }
  return -1;
}
  int __target__(int[] array,int start,int end,int element){
  for (int i=start; i < end; i++) {
    if (element != array[i]) {
      return i;
    }
  }
  return -1;
}

}