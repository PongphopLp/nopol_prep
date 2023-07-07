import java.util.*;

public class Target {

boolean areEqualChars(char[] b1,char[] b2){
  if (b1 == null) {
    return (b2 == null);
  }
 else   if (b2 == null) {
    return false;
  }
 else   if (b1 == b2) {
    return true;
  }
 else   if (b1.length != b2.length) {
    return false;
  }
  for (int i=0; i < b1.length; i++) {
    if (b1[i] != b2[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(char[] b1,char[] b2){
  if (b1 == null) {
    return (b2 == null);
  }
 else   if (b2 == null) {
    return false;
  }
 else   if (b1 == b2) {
    return true;
  }
 else   if (b1.length != b2.length) {
    return false;
  }
  for (int i=0; i < b1.length; i++) {
    if (b1[i] == b2[i]) {
      return false;
    }
  }
  return true;
}

}