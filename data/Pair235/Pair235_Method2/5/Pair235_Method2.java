import java.util.*;

public class Target {

boolean oidEquals(int[] oid1,int[] oid2){
  int length=oid1.length;
  if (length != oid2.length) {
    return false;
  }
  while (length > 0) {
    if (oid1[--length] != oid2[length]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(int[] oid1,int[] oid2){
  int length=oid1.length;
  if (length != oid2.length) {
    return false;
  }
  while (length > 0) {
    if (oid1[++length] != oid2[length]) {
      return false;
    }
  }
  return true;
}

}