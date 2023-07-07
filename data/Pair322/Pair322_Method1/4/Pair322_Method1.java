import java.util.*;

public class Target {

boolean compare(String[] r,String[] s){
  int l=r.length;
  if (l == s.length) {
    if (l != 0) {
      for (int i=0; i < l; i++) {
        if (!r[i].equals(s[i])) {
          return false;
        }
      }
    }
    return true;
  }
  return false;
}
  boolean __target__(String[] r,String[] s){
  int l=r.length;
  if (l == s.length) {
    if (l != 0) {
      for (int i=0; i >= l; i++) {
        if (!r[i].equals(s[i])) {
          return false;
        }
      }
    }
    return true;
  }
  return false;
}

}