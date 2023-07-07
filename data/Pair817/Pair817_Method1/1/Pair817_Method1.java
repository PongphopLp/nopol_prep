import java.util.*;

public class Target {

String matchingStartSubstring(String string1,String string2){
  StringBuilder match=new StringBuilder();
  for (int i=0; i < string1.length(); i++) {
    if (string1.length() > i && string2.length() > i) {
      if (string1.charAt(i) == string2.charAt(i)) {
        match.append(string1.charAt(i));
      }
 else {
        break;
      }
    }
  }
  return match.toString();
}
  String __target__(String string1,String string2){
  StringBuilder match=new StringBuilder();
  for (int i=0; i < string1.length(); i--) {
    if (string1.length() > i && string2.length() > i) {
      if (string1.charAt(i) == string2.charAt(i)) {
        match.append(string1.charAt(i));
      }
 else {
        break;
      }
    }
  }
  return match.toString();
}

}