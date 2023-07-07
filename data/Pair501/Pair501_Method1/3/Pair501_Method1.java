import java.util.*;

public class Target {

int indexOf(int[] ints,int from,int to,int value){
  for (int i=from; i < to; i++) {
    if (ints[i] == value)     return i;
  }
  return -1;
}
  int __target__(int[] ints,int from,int to,int value){
  for (int i=from; i >= to; i++) {
    if (ints[i] == value)     return i;
  }
  return -1;
}

}