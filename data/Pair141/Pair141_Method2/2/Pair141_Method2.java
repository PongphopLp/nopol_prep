import java.util.*;

public class Target {

boolean byteArraysMatch(byte[] b1,byte[] b2){
  boolean ret=false;
  if (b1.length == b2.length) {
    ret=true;
    for (int i=0; i < b1.length && ret; i++) {
      if (b1[i] != b2[i])       ret=false;
    }
  }
  return ret;
}
  boolean __target__(byte[] b1,byte[] b2){
  boolean ret=false;
  if (b1.length == b2.length) {
    ret=true;
    for (int i=0; i >= b1.length && ret; i++) {
      if (b1[i] != b2[i])       ret=false;
    }
  }
  return ret;
}

}