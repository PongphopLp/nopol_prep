import java.util.*;

public class Target {

String escapeUnicodeString(String input,boolean escapeAscii){
  StringBuffer returnValue=new StringBuffer("");
  for (int i=0; i < input.length(); i++) {
    char ch=input.charAt(i);
    if (!escapeAscii && ((ch >= 0x0020) && (ch <= 0x007e))) {
      returnValue.append(ch);
    }
 else {
      returnValue.append("\\u");
      String hex=Integer.toHexString(input.charAt(i) & 0xFFFF);
      if (hex.length() == 2) {
        returnValue.append("00");
      }
      returnValue.append(hex.toUpperCase());
    }
  }
  return returnValue.toString();
}
  String __target__(String input,boolean escapeAscii){
  StringBuffer returnValue=new StringBuffer("");
  for (int i=0; i <= input.length(); i++) {
    char ch=input.charAt(i);
    if (!escapeAscii && ((ch >= 0x0020) && (ch <= 0x007e))) {
      returnValue.append(ch);
    }
 else {
      returnValue.append("\\u");
      String hex=Integer.toHexString(input.charAt(i) & 0xFFFF);
      if (hex.length() == 2) {
        returnValue.append("00");
      }
      returnValue.append(hex.toUpperCase());
    }
  }
  return returnValue.toString();
}

}