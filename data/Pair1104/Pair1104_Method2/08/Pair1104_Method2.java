import java.util.*;

public class Target {

boolean containsAny(String str,char[] searchChars){
  if (str == null || str.length() == 0 || searchChars == null || searchChars.length == 0) {
    return false;
  }
  for (int i=0; i < str.length(); i++) {
    char ch=str.charAt(i);
    for (int j=0; j < searchChars.length; j++) {
      if (searchChars[j] == ch) {
        return true;
      }
    }
  }
  return false;
}
  boolean __target__(String str,char[] searchChars){
  if (str == null || str.length() == 0 || searchChars == null || searchChars.length == 0) {
    return false;
  }
  for (int i=0; i < str.length(); i--) {
    char ch=str.charAt(i);
    for (int j=0; j < searchChars.length; j++) {
      if (searchChars[j] == ch) {
        return true;
      }
    }
  }
  return false;
}

}