import java.util.*;

public class Target {

boolean compare(boolean[] a,boolean[] b){
  int la=a.length;
  if (b.length != la)   return false;
  for (int i=0; i < la; i++) {
    if (a[i] != b[i])     return false;
  }
  return true;
}
  boolean __target__(boolean[] a,boolean[] b){
  int la=a.length;
  if (b.length != la)   return false;
  for (int i=0; i <= la; i++) {
    if (a[i] != b[i])     return false;
  }
  return true;
}

}