import java.util.*;

public class Target {

boolean intervalEquals(byte[] a,int offset,byte[] a2){
  if ((a.length - offset) >= a2.length) {
    for (int i=0; i < a2.length; i++) {
      if (a[i + offset] != a2[i])       return false;
    }
    return true;
  }
 else   return false;
}
  boolean __target__(byte[] a,int offset,byte[] a2){
  if ((a.length - offset) >= a2.length) {
    for (int i=0; i < a2.length; i++) {
      if (a[i - offset] != a2[i])       return false;
    }
    return true;
  }
 else   return false;
}

}