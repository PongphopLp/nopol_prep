import java.util.*;

public class Target {

int findAny(byte[] a,byte[] v,int from,int to){
  for (int i=from; i < to; ++i) {
    boolean substringMatch=true;
    for (int j=0; j < v.length; ++j) {
      if (a[i + j] != v[j]) {
        substringMatch=false;
        break;
      }
    }
    if (substringMatch)     return i;
  }
  return -1;
}
  int __target__(byte[] a,byte[] v,int from,int to){
  for (int i=from; i >= to; ++i) {
    boolean substringMatch=true;
    for (int j=0; j < v.length; ++j) {
      if (a[i + j] != v[j]) {
        substringMatch=false;
        break;
      }
    }
    if (substringMatch)     return i;
  }
  return -1;
}

}