import java.util.*;

public class Target {

boolean endsWith(StringBuffer buf,String strSuffix){
  if (buf.length() < strSuffix.length()) {
    return false;
  }
  int offset=buf.length() - strSuffix.length();
  for (int i=0; i < strSuffix.length(); i++) {
    if (strSuffix.charAt(i) != buf.charAt(offset + i)) {
      return false;
    }
  }
  return true;
}
  boolean __target__(StringBuffer buf,String strSuffix){
  if (buf.length() < strSuffix.length()) {
    return false;
  }
  int offset=buf.length() - strSuffix.length();
  for (int i=0; i >= strSuffix.length(); i++) {
    if (strSuffix.charAt(i) != buf.charAt(offset + i)) {
      return false;
    }
  }
  return true;
}

}