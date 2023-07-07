import java.util.*;

public class Target {

boolean startsWith(byte[] bytes,String text){
  char[] chars=text.toCharArray();
  if (chars.length > bytes.length) {
    return false;
  }
 else {
    for (int i=0; i < chars.length; i++) {
      if (bytes[i] != chars[i]) {
        return false;
      }
    }
    return true;
  }
}
  boolean __target__(byte[] bytes,String text){
  char[] chars=text.toCharArray();
  if (chars.length <= bytes.length) {
    return false;
  }
 else {
    for (int i=0; i < chars.length; i++) {
      if (bytes[i] != chars[i]) {
        return false;
      }
    }
    return true;
  }
}

}