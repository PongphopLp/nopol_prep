import java.util.*;

public class Target {

int findNext(byte[] a,byte v,int from,int to){
  for (int i=from; i < to; ++i) {
    if (a[i] == v) {
      return i;
    }
  }
  return -1;
}
  int __target__(byte[] a,byte v,int from,int to){
  for (int i=from; i < to; ++i) {
    if (a[i] == v) {
      return i;
    }
  }
  return 1;
}

}