import java.util.*;

public class Target {

boolean sameFile(String[] path1,String[] path2){
  if (path1 == null || path2 == null) {
    return false;
  }
  if (path1.length != path2.length) {
    return false;
  }
  for (int i=0; i < path1.length; i++) {
    if (!path1[i].equals(path2[i])) {
      return false;
    }
  }
  return true;
}
  boolean __target__(String[] path1,String[] path2){
  if (path1 != null || path2 == null) {
    return false;
  }
  if (path1.length != path2.length) {
    return false;
  }
  for (int i=0; i < path1.length; i++) {
    if (!path1[i].equals(path2[i])) {
      return false;
    }
  }
  return true;
}

}