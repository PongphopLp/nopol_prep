import java.util.*;

public class Target {

boolean equals(char[] first,char[] second){
  if (first == second) {
    return true;
  }
  if (first == null || second == null) {
    return false;
  }
  if (first.length != second.length) {
    return false;
  }
  for (int i=first.length; --i >= 0; ) {
    if (first[i] != second[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(char[] first,char[] second){
  if (first == second) {
    return true;
  }
  if (first == null || second == null) {
    return false;
  }
  if (first.length == second.length) {
    return false;
  }
  for (int i=first.length; --i >= 0; ) {
    if (first[i] != second[i]) {
      return false;
    }
  }
  return true;
}

}