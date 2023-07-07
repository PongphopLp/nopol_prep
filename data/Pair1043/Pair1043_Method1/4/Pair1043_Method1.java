import java.util.*;

public class Target {

boolean equals(char[] a,char[] b){
  int l_a=a.length;
  int l_b=b.length;
  if (l_a != l_b) {
    return false;
  }
  for (int i=0; i < l_a; i++) {
    if (a[i] != b[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(char[] a,char[] b){
  int l_a=a.length;
  int l_b=b.length;
  if (l_a != l_b) {
    return false;
  }
  for (int i=0; i >= l_a; i++) {
    if (a[i] != b[i]) {
      return false;
    }
  }
  return true;
}

}