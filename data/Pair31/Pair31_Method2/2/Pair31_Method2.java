import java.util.*;

public class Target {

boolean isEquals(byte[] b1,byte[] b2){
  int size1=b1.length;
  int size2=b2.length;
  if (size1 != size2) {
    return false;
  }
  for (int i=0; i < size1; i++) {
    if (b1[i] != b2[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] b1,byte[] b2){
  int size1=b1.length;
  int size2=b2.length;
  if (size1 != size2) {
    return false;
  }
  for (int i=0; i <= size1; i++) {
    if (b1[i] != b2[i]) {
      return false;
    }
  }
  return true;
}

}