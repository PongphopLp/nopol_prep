import java.util.*;

public class Target {

boolean equals(char[] ch1,char[] ch2){
  if (ch1 == null) {
    if (ch2 == null) {
      return true;
    }
 else {
      return false;
    }
  }
 else   if (ch2 == null) {
    return false;
  }
  if (ch1.length != ch2.length)   return false;
  for (int i=0; i < ch1.length; i++) {
    if (ch1[i] != ch2[i])     return false;
  }
  return true;
}
  boolean __target__(char[] ch1,char[] ch2){
  if (ch1 == null) {
    if (ch2 != null) {
      return true;
    }
 else {
      return false;
    }
  }
 else   if (ch2 == null) {
    return false;
  }
  if (ch1.length != ch2.length)   return false;
  for (int i=0; i < ch1.length; i++) {
    if (ch1[i] != ch2[i])     return false;
  }
  return true;
}

}