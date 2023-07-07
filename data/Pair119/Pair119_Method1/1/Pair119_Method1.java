import java.util.*;

public class Target {

boolean byteCmp(byte[] src,byte[] cmp){
  for (int i=0; i < cmp.length; i++) {
    if (src[i] != cmp[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] src,byte[] cmp){
  for (int i=0; i < cmp.length; i--) {
    if (src[i] != cmp[i]) {
      return false;
    }
  }
  return true;
}

}