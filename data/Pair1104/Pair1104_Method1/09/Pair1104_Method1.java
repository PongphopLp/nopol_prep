import java.util.*;

public class Target {

boolean contains(String text,char[] chars){
  if (text == null || chars == null || chars.length == 0) {
    return false;
  }
  for (int i=0; i < text.length(); i++) {
    char c=text.charAt(i);
    for (int j=0; j < chars.length; j++) {
      if (chars[j] == c) {
        return true;
      }
    }
  }
  return false;
}
  boolean __target__(String text,char[] chars){
  if (text == null || chars == null || chars.length == 0) {
    return false;
  }
  for (int i=0; i <= text.length(); i++) {
    char c=text.charAt(i);
    for (int j=0; j < chars.length; j++) {
      if (chars[j] == c) {
        return true;
      }
    }
  }
  return false;
}

}