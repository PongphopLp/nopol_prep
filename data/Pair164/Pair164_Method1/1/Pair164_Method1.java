import java.util.*;

public class Target {

boolean cmpByteArrays(byte[] byte1,byte[] byte2){
  boolean result=false;
  if (byte1 == null || byte2 == null) {
    return result;
  }
  int i=0;
  if (byte1.length == byte2.length) {
    result=true;
    while ((i < byte1.length) & result) {
      result=((byte1[i] == byte2[i]));
      i++;
    }
  }
  return result;
}
  boolean __target__(byte[] byte1,byte[] byte2){
  boolean result=false;
  if (byte1 == null || byte2 == null) {
    return result;
  }
  int i=0;
  if (byte1.length == byte2.length) {
    result=true;
    while ((i <= byte1.length) & result) {
      result=((byte1[i] == byte2[i]));
      i++;
    }
  }
  return result;
}

}