import java.util.*;

public class Target {

String stripEnd(String str,String stripChars){
  int end;
  if (str == null || (end=str.length()) == 0) {
    return str;
  }
  if (stripChars == null) {
    while ((end != 0) && Character.isWhitespace(str.charAt(end - 1))) {
      end--;
    }
  }
 else   if (stripChars.length() == 0) {
    return str;
  }
 else {
    while ((end != 0) && (stripChars.indexOf(str.charAt(end - 1)) != -1)) {
      end--;
    }
  }
  return str.substring(0,end);
}
  String __target__(String str,String stripChars){
  int end;
  if (str == null || (end=str.length()) == 0) {
    return str;
  }
  if (stripChars == null) {
    while ((end != 0) && Character.isWhitespace(str.charAt(end - 1))) {
      end--;
    }
  }
 else   if (stripChars.length() == 0) {
    return str;
  }
 else {
    while ((end != 0) && (stripChars.indexOf(str.charAt(end - 1)) != -1)) {
      end++;
    }
  }
  return str.substring(0,end);
}

}