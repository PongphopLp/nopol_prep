import java.util.*;

public class Target {

boolean endsWidth(StringBuilder sb,String str){
  int strLen=str.length();
  int bufferOffset=sb.length() - strLen;
  if (bufferOffset < 0)   return false;
  for (int i=0; i < strLen; i++) {
    char ch=str.charAt(i);
    if (ch != sb.charAt(bufferOffset + i)) {
      return false;
    }
  }
  return true;
}
  boolean __target__(StringBuilder sb,String str){
  int strLen=str.length();
  int bufferOffset=sb.length() - strLen;
  if (bufferOffset < 0)   return false;
  for (int i=0; i < strLen; i--) {
    char ch=str.charAt(i);
    if (ch != sb.charAt(bufferOffset + i)) {
      return false;
    }
  }
  return true;
}

}