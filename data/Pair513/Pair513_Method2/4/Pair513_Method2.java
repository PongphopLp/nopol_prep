import java.util.*;

public class Target {

int findNext(byte[] a,byte[] v,int from,int to){
  for (int i=from; i < to; ++i) {
    boolean foundMatch=true;
    for (int j=0; j < v.length; ++j) {
      if (a[i + j] != v[j]) {
        foundMatch=false;
        break;
      }
    }
    if (foundMatch) {
      return i;
    }
  }
  return -1;
}
  int __target__(byte[] a,byte[] v,int from,int to){
  for (int i=from; i < to; ++i) {
    boolean foundMatch=true;
    for (int j=0; j < v.length; ++j) {
      if (a[i - j] != v[j]) {
        foundMatch=false;
        break;
      }
    }
    if (foundMatch) {
      return i;
    }
  }
  return -1;
}

}