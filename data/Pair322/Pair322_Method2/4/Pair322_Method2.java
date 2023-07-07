import java.util.*;

public class Target {

boolean compareStringArrays(String[] s1,String[] s2){
  boolean equal=true;
  int index=0;
  if (s1.length == s2.length) {
    while ((index < s1.length) && (equal)) {
      if (s1[index].equals(s2[index])) {
        index++;
      }
 else {
        equal=false;
      }
    }
    if (index == s1.length)     return true;
 else     return false;
  }
 else {
    return false;
  }
}
  boolean __target__(String[] s1,String[] s2){
  boolean equal=true;
  int index=0;
  if (s1.length == s2.length) {
    while ((index < s1.length) && (equal)) {
      if (s1[index].equals(s2[index])) {
        index++;
      }
 else {
        equal=false;
      }
    }
    if (index != s1.length)     return true;
 else     return false;
  }
 else {
    return false;
  }
}

}