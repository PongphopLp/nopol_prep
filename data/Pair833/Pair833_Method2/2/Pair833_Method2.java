import java.util.*;

public class Target {

boolean bytecmp(byte[] b1,byte[] b2,int len){
  for (int i=0; i < len; ++i) {
    if (b1[i] != b2[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] b1,byte[] b2,int len){
  for (int i=0; i < len; ++i) {
    if (b1[i] == b2[i]) {
      return false;
    }
  }
  return true;
}

}