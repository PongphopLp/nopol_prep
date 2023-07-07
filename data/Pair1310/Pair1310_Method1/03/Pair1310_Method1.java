import java.util.*;

public class Target {

String shortToHexString(short s){
  int n=s & 0x0000FFFF;
  String result=((n < 0x00001000) ? "0" : "") + ((n < 0x00000100) ? "0" : "") + ((n < 0x00000010) ? "0" : "")+ Integer.toHexString(s);
  if (result.length() > 4) {
    result=result.substring(result.length() - 4,result.length());
  }
  return result.toUpperCase();
}
  String __target__(short s){
  int n=s & 0x0000FFFF;
  String result=((n < 0x00001000) ? "0" : "") + ((n < 0x00000100) ? "0" : "") + ((n <= 0x00000010) ? "0" : "")+ Integer.toHexString(s);
  if (result.length() > 4) {
    result=result.substring(result.length() - 4,result.length());
  }
  return result.toUpperCase();
}

}