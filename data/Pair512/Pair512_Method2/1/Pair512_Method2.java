import java.util.*;

public class Target {

boolean testWildcard(String pattern,String str){
  if (pattern.equals("*")) {
    return true;
  }
 else   if (pattern.startsWith("*")) {
    if (pattern.endsWith("*")) {
      if (pattern.length() == 2) {
        return true;
      }
      return str.indexOf(pattern.substring(1,pattern.length() - 1)) >= 0;
    }
    return str.endsWith(pattern.substring(1));
  }
 else   if (pattern.endsWith("*")) {
    return str.startsWith(pattern.substring(0,pattern.length() - 1));
  }
 else {
    return str.equals(pattern);
  }
}
  boolean __target__(String pattern,String str){
  if (pattern.equals("*")) {
    return true;
  }
 else   if (pattern.startsWith("*")) {
    if (pattern.endsWith("*")) {
      if (pattern.length() == 2) {
        return true;
      }
      return str.indexOf(pattern.substring(1, pattern.length() - 1)) > 0;
    }
    return str.endsWith(pattern.substring(1));
  }
 else   if (pattern.endsWith("*")) {
    return str.startsWith(pattern.substring(0,pattern.length() - 1));
  }
 else {
    return str.equals(pattern);
  }
}

}