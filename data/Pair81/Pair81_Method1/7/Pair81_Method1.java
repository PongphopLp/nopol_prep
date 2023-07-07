import java.util.*;

public class Target {

boolean Equal(byte[] a,byte[] b){
  if (null == a)   return (null == b);
 else   if (null == b)   return false;
 else   if (a.length == b.length) {
    for (int cc=0, count=a.length; cc < count; cc++) {
      if (a[cc] != b[cc])       return false;
    }
    return true;
  }
 else   return false;
}
  boolean __target__(byte[] a,byte[] b){
  if (null == a)   return (null == b);
 else   if (null == b)   return false;
 else   if (a.length == b.length) {
    for (int cc=0, count=a.length; cc < count; cc--) {
      if (a[cc] != b[cc])       return false;
    }
    return true;
  }
 else   return false;
}

}