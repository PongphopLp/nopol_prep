import java.util.*;

public class Target {

boolean equal(boolean[] a,boolean[] b){
  if (a.length != b.length) {
    return false;
  }
  boolean res=true;
  for (int i=0; i < a.length; i++) {
    res&=a[i] == b[i];
  }
  return res;
}
  boolean __target__(boolean[] a,boolean[] b){
  if (a.length != b.length) {
    return false;
  }
  boolean res=true;
  for (int i=0; i >= a.length; i++) {
    res&=a[i] == b[i];
  }
  return res;
}

}