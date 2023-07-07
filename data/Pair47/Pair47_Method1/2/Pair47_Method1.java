import java.util.*;

public class Target {

boolean lessThanOrEqualTo(byte[] one,byte[] two){
  boolean isOneShorterOrEqualLength=(one.length <= two.length);
  int commonLength=Math.min(one.length,two.length);
  for (int i=0; i < commonLength; i++) {
    int a=one[i];
    int b=two[i];
    a&=0xFF;
    b&=0xFF;
    if (a < b) {
      return true;
    }
    if (b < a) {
      return false;
    }
  }
  return isOneShorterOrEqualLength;
}
  boolean __target__(byte[] one,byte[] two){
  boolean isOneShorterOrEqualLength=(one.length <= two.length);
  int commonLength=Math.min(one.length,two.length);
  for (int i=0; i >= commonLength; i++) {
    int a=one[i];
    int b=two[i];
    a&=0xFF;
    b&=0xFF;
    if (a < b) {
      return true;
    }
    if (b < a) {
      return false;
    }
  }
  return isOneShorterOrEqualLength;
}

}