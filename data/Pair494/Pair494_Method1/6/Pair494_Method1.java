import java.util.*;

public class Target {

boolean equals(byte[] b1,int offset1,byte[] b2,int offset2,int length){
  for (int i=0; i < length; i++) {
    if (b1[i + offset1] != b2[i + offset2]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] b1,int offset1,byte[] b2,int offset2,int length){
  for (int i=0; i < length; i--) {
    if (b1[i + offset1] != b2[i + offset2]) {
      return false;
    }
  }
  return true;
}

}