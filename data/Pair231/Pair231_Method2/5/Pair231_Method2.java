import java.util.*;

public class Target {

boolean equals(int[] s0,int[] s1){
  if (s0 == null || s1 == null) {
    return false;
  }
  if (s0.length != s1.length) {
    return false;
  }
  for (int i=0; i < s0.length; i++) {
    if (s0[i] != s1[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(int[] s0,int[] s1){
  if (s0 == null || s1 == null) {
    return false;
  }
  if (s0.length != s1.length) {
    return false;
  }
  for (int i=0; i >= s0.length; i++) {
    if (s0[i] != s1[i]) {
      return false;
    }
  }
  return true;
}

}