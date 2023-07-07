import java.util.*;

public class Target {

int indexOf(byte[] a,byte[] b){
  boolean check=true;
  if (a.length < b.length)   return -1;
  for (int i=0; i < a.length - b.length + 1; i++) {
    if (a[i] == b[0]) {
      check=true;
      for (int e=0; e < b.length; e++) {
        if (a[i + e] != b[e]) {
          check=false;
        }
      }
      if (check)       return i;
    }
  }
  return -1;
}
  int __target__(byte[] a,byte[] b){
  boolean check=true;
  if (a.length < b.length)   return -1;
  for (int i=0; i < a.length - b.length + 1; i++) {
    if (a[i] == b[0]) {
      check=true;
      for (int e=0; e < b.length; e++) {
        if (a[i - e] != b[e]) {
          check=false;
        }
      }
      if (check)       return i;
    }
  }
  return -1;
}

}