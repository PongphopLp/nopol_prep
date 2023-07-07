import java.util.*;

public class Target {

boolean compare(byte[] src1,byte[] src2){
  for (int i=0; i < 16; i++) {
    if (src1[i] != src2[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] src1,byte[] src2){
  for (int i=0; i < 16; i--) {
    if (src1[i] != src2[i])     return false;
  }
  return true;
}

}