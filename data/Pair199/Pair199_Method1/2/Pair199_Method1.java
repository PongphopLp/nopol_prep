import java.util.*;

public class Target {

boolean boundaryCompare(byte[] src,int srcOff,byte[] bound){
  int j=srcOff;
  for (int i=0; i < bound.length; i++) {
    if (src[j] != bound[i]) {
      return false;
    }
    j++;
  }
  return true;
}
  boolean __target__(byte[] src,int srcOff,byte[] bound){
  int j=srcOff;
  for (int i=0; i < bound.length; i++) {
    if (src[j] != bound[i]) {
      return false;
    }
    j--;
  }
  return true;
}

}