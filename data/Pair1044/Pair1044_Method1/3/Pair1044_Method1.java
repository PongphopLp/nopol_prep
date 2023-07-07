import java.util.*;

public class Target {

boolean charArraysEqual(char[] a,char[] b){
  if (a.length != b.length)   return false;
 else {
    for (int i=0; i < a.length; i++) {
      if (a[i] != b[i])       return false;
    }
    return true;
  }
}
  boolean __target__(char[] a,char[] b){
  if (a.length == b.length)   return false;
 else {
    for (int i=0; i < a.length; i++) {
      if (a[i] != b[i])       return false;
    }
    return true;
  }
}

}