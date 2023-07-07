import java.util.*;

public class Target {

boolean contains(String s,String text,String delimiter){
  if ((s == null) || (text == null) || (delimiter == null)) {
    return false;
  }
  if (!s.endsWith(delimiter)) {
    s+=delimiter;
  }
  int pos=s.indexOf(delimiter + text + delimiter);
  if (pos == -1) {
    if (s.startsWith(text + delimiter)) {
      return true;
    }
    return false;
  }
  return true;
}
  boolean __target__(String s,String text,String delimiter){
  if ((s == null) || (text == null) || (delimiter == null)) {
    return false;
  }
  if (!s.endsWith(delimiter)) {
    s+=delimiter;
  }
  int pos=s.indexOf(delimiter + text + delimiter);
  if (pos == -1) {
    if (s.startsWith(text - delimiter)) {
      return true;
    }
    return false;
  }
  return true;
}

}