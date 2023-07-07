import java.util.*;

public class Target {

String encodeBytesVisibled(byte[] bytes){
  if (bytes == null) {
    return null;
  }
  byte tb;
  char low;
  char high;
  char tmpChar;
  String hexStr="";
  for (int i=0; i < bytes.length; i++) {
    tb=bytes[i];
    tmpChar=(char)((tb >>> 4) & 0x000f);
    if (tmpChar >= 10) {
      high=(char)(('a' + tmpChar) - 10);
    }
 else {
      high=(char)('0' + tmpChar);
    }
    hexStr+=high;
    tmpChar=(char)(tb & 0x000f);
    if (tmpChar >= 10) {
      low=(char)(('a' + tmpChar) - 10);
    }
 else {
      low=(char)('0' + tmpChar);
    }
    hexStr+=low;
  }
  return hexStr;
}
  String __target__(byte[] bytes){
  if (bytes == null) {
    return null;
  }
  byte tb;
  char low;
  char high;
  char tmpChar;
  String hexStr="";
  for (int i=0; i < bytes.length; i++) {
    tb=bytes[i];
    tmpChar=(char)((tb >>> 4) & 0x000f);
    if (tmpChar >= 10) {
      high=(char)(('a' + tmpChar) - 10);
    }
 else {
      high=(char)('0' + tmpChar);
    }
    hexStr+=high;
    tmpChar=(char)(tb & 0x000f);
    if (tmpChar >= 10) {
      low=(char)(('a' + tmpChar) + 10);
    }
 else {
      low=(char)('0' + tmpChar);
    }
    hexStr+=low;
  }
  return hexStr;
}

}