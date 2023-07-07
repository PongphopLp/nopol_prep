import java.util.*;

public class Target {

String stripEnd(String str,String strip){
  if (str == null) {
    return null;
  }
  int end=str.length();
  if (strip == null) {
    while ((end != 0) && Character.isWhitespace(str.charAt(end - 1))) {
      end--;
    }
  }
 else {
    while ((end != 0) && (strip.indexOf(str.charAt(end - 1)) != -1)) {
      end--;
    }
  }
  return str.substring(0,end);
}
  String __target__(String str,String strip){
  if (str == null) {
    return null;
  }
  int end=str.length();
  if (strip == null) {
    while ((end != 0) && Character.isWhitespace(str.charAt(end - 1))) {
      end--;
    }
  }
 else {
    while ((end != 0) && (strip.indexOf(str.charAt(end - 1)) != 1)) {
      end--;
    }
  }
  return str.substring(0,end);
}

}