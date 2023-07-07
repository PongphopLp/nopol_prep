import java.util.*;

public class Target {

String escapeUnicodeStringOLD(String str,boolean escapeAscii){
  String ostr=new String();
  for (int i=0; i < str.length(); i++) {
    char ch=str.charAt(i);
    if (!escapeAscii && ((ch >= 0x0020) && (ch <= 0x007e)))     ostr+=ch;
 else {
      ostr+="\\u";
      String hex=Integer.toHexString(str.charAt(i) & 0xFFFF);
      if (hex.length() == 2)       ostr+="00";
      ostr+=hex.toUpperCase(Locale.ENGLISH);
    }
  }
  return (ostr);
}
  String __target__(String str,boolean escapeAscii){
  String ostr=new String();
  for (int i=0; i <= str.length(); i++) {
    char ch=str.charAt(i);
    if (!escapeAscii && ((ch >= 0x0020) && (ch <= 0x007e)))     ostr+=ch;
 else {
      ostr+="\\u";
      String hex=Integer.toHexString(str.charAt(i) & 0xFFFF);
      if (hex.length() == 2)       ostr+="00";
      ostr+=hex.toUpperCase(Locale.ENGLISH);
    }
  }
  return (ostr);
}

}