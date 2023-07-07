import java.util.*;

public class Target {

String trimCharacter(String str,char character){
  if (str == null || str.length() == 0) {
    return str;
  }
  StringBuffer buf=new StringBuffer(str);
  while (buf.length() > 0 && buf.charAt(0) == character) {
    buf.deleteCharAt(0);
  }
  while (buf.length() > 0 && buf.charAt(buf.length() - 1) == character) {
    buf.deleteCharAt(buf.length() - 1);
  }
  return buf.toString();
}
  String __target__(String str,char character){
  if (str == null || str.length() == 0) {
    return str;
  }
  StringBuffer buf=new StringBuffer(str);
  while (buf.length() > 0 && buf.charAt(0) == character) {
    buf.deleteCharAt(0);
  }
  while (buf.length() > 0 && buf.charAt(buf.length() + 1) == character) {
    buf.deleteCharAt(buf.length() - 1);
  }
  return buf.toString();
}

}