import java.util.*;

public class Target {

boolean textEquals(CharSequence text1,CharSequence text2){
  if (text1 == text2) {
    return true;
  }
  int len=text1.length();
  if (len == text2.length()) {
    for (int i=len - 1; i >= 0; i--) {
      if (text1.charAt(i) != text2.charAt(i)) {
        return false;
      }
    }
    return true;
  }
  return false;
}
  boolean __target__(CharSequence text1,CharSequence text2){
  if (text1 == text2) {
    return true;
  }
  int len=text1.length();
  if (len != text2.length()) {
    for (int i=len - 1; i >= 0; i--) {
      if (text1.charAt(i) != text2.charAt(i)) {
        return false;
      }
    }
    return true;
  }
  return false;
}

}