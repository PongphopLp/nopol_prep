import java.util.*;

public class Target {

boolean startsWith(byte[] target,byte[] prefix){
  final int testlen=prefix.length;
  if (target.length < testlen) {
    return false;
  }
  for (int i=0; i < testlen; i++) {
    if (target[i] != prefix[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] target,byte[] prefix){
  final int testlen=prefix.length;
  if (target.length <= testlen) {
    return false;
  }
  for (int i=0; i < testlen; i++) {
    if (target[i] != prefix[i]) {
      return false;
    }
  }
  return true;
}

}