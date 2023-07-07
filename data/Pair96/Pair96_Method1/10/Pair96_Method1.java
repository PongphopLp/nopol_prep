import java.util.*;

public class Target {

String encode(byte[] pHexBinary){
  StringBuffer result=new StringBuffer();
  for (int i=0; i < pHexBinary.length; i++) {
    byte b=pHexBinary[i];
    byte c=(byte)((b & 0xf0) >> 4);
    if (c <= 9) {
      result.append((char)('0' + c));
    }
 else {
      result.append((char)('A' + c - 10));
    }
    c=(byte)(b & 0x0f);
    if (c <= 9) {
      result.append((char)('0' + c));
    }
 else {
      result.append((char)('A' + c - 10));
    }
  }
  return result.toString();
}
  String __target__(byte[] pHexBinary){
  StringBuffer result=new StringBuffer();
  for (int i=0; i < pHexBinary.length; i++) {
    byte b=pHexBinary[i];
    byte c=(byte)((b & 0xf0) >> 4);
    if (c < 9) {
      result.append((char)('0' + c));
    }
 else {
      result.append((char)('A' + c - 10));
    }
    c=(byte)(b & 0x0f);
    if (c <= 9) {
      result.append((char)('0' + c));
    }
 else {
      result.append((char)('A' + c - 10));
    }
  }
  return result.toString();
}

}