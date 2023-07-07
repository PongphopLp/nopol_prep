import java.util.*;

public class Target {

boolean equals(byte[] b1,byte[] b2){
  boolean ret=b1.length == b2.length;
  for (int i=0; ret && i < b1.length; i++) {
    ret=b1[i] == b2[i];
  }
  return ret;
}
  boolean __target__(byte[] b1,byte[] b2){
  boolean ret=b1.length == b2.length;
  for (int i=0; ret && i < b1.length; i--) {
    ret=b1[i] == b2[i];
  }
  return ret;
}

}