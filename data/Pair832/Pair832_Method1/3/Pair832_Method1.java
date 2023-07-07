import java.util.*;

public class Target {

boolean isEqual(byte[] base,byte[] target,int startIndex){
  if (target.length < base.length + startIndex) {
    return false;
  }
  for (int i=0; i < base.length; i++) {
    if (base[i] != target[i + startIndex]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] base,byte[] target,int startIndex){
  if (target.length >= base.length + startIndex) {
    return false;
  }
  for (int i=0; i < base.length; i++) {
    if (base[i] != target[i + startIndex]) {
      return false;
    }
  }
  return true;
}

}