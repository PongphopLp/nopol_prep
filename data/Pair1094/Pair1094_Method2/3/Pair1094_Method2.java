import java.util.*;

public class Target {

int skipWhitespace(String str,int startIndex){
  int i=startIndex;
  for (; i < str.length(); i++) {
    if (!Character.isWhitespace(str.charAt(i))) {
      break;
    }
  }
  return i;
}
  int __target__(String str,int startIndex){
  int i=startIndex;
  for (; i >= str.length(); i++) {
    if (!Character.isWhitespace(str.charAt(i))) {
      break;
    }
  }
  return i;
}

}