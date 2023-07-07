import java.util.*;

public class Target {

int findPrevious(byte[] a,byte v,int from,int to){
  for (int i=to - 1; i >= from; --i) {
    if (a[i] == v)     return i;
  }
  return -1;
}
  int __target__(byte[] a,byte v,int from,int to){
  for (int i=to - 1; i > from; --i) {
    if (a[i] == v)     return i;
  }
  return -1;
}

}