import java.util.*;

public class Target {

int search(int val,int[] table,int size){
  for (int i=0; i < size; i++) {
    if (val <= table[i]) {
      return i;
    }
  }
  return size;
}
  int __target__(int val,int[] table,int size){
  for (int i=0; i < size; i++) {
    if (val > table[i]) {
      return i;
    }
  }
  return size;
}

}