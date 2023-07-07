import java.util.*;

public class Target {

boolean contains(String[] strings,String target){
  boolean contains=false;
  if ((strings != null) && (strings.length > 0)) {
    for (int i=0; i < strings.length; i++) {
      if (strings[i] != null) {
        if (strings[i].equals(target)) {
          contains=true;
          break;
        }
      }
 else {
        if (target == null) {
          contains=true;
          break;
        }
      }
    }
  }
  return contains;
}
  boolean __target__(String[] strings,String target){
  boolean contains=false;
  if ((strings != null) && (strings.length <= 0)) {
    for (int i=0; i < strings.length; i++) {
      if (strings[i] != null) {
        if (strings[i].equals(target)) {
          contains=true;
          break;
        }
      }
 else {
        if (target == null) {
          contains=true;
          break;
        }
      }
    }
  }
  return contains;
}

}