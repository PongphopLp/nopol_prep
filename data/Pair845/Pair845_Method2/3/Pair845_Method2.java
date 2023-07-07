import java.util.*;

public class Target {

int findNextStartTagIndex(String json,int startFrom){
  int length=json.length();
  for (int i=startFrom; i < length; i++) {
    char curChar=json.charAt(i);
    if (Character.isWhitespace(curChar)) {
      continue;
    }
    return i;
  }
  return -1;
}
  int __target__(String json,int startFrom){
  int length=json.length();
  for (int i=startFrom; i < length; i--) {
    char curChar=json.charAt(i);
    if (Character.isWhitespace(curChar)) {
      continue;
    }
    return i;
  }
  return -1;
}

}