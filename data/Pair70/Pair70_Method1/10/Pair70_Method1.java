import java.util.*;

public class Target {

String convertToHex(byte[] data){
  StringBuilder buf=new StringBuilder();
  for (int i=0; i < data.length; i++) {
    int low4Bits=data[i] & 0x0F;
    int high4Bits=(data[i] & 0xF0) >>> 4;
    buf.append(0 <= high4Bits && high4Bits <= 9 ? (char)('0' + high4Bits) : (char)('a' + (high4Bits - 10)));
    buf.append(0 <= low4Bits && low4Bits <= 9 ? (char)('0' + low4Bits) : (char)('a' + (low4Bits - 10)));
  }
  return buf.toString();
}
  String __target__(byte[] data){
  StringBuilder buf=new StringBuilder();
  for (int i=0; i < data.length; i++) {
    int low4Bits=data[i] & 0x0F;
    int high4Bits=(data[i] & 0xF0) >>> 4;
    buf.append(0 <= high4Bits && high4Bits <= 9 ? (char)('0' + high4Bits) : (char)('a' + (high4Bits - 10)));
    buf.append(0 <= low4Bits && low4Bits < 9 ? (char)('0' + low4Bits) : (char)('a' + (low4Bits - 10)));
  }
  return buf.toString();
}

}