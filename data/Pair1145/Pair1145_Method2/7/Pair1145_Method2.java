import java.util.*;

public class Target {

boolean isAliase(String[] aliases,String url){
  if (url == null) {
    for (int i=0; i < aliases.length; i++) {
      if (aliases[i] == null) {
        return true;
      }
    }
  }
 else {
    for (int i=0; i < aliases.length; i++) {
      if (url.equals(aliases[i])) {
        return true;
      }
    }
  }
  return false;
}
  boolean __target__(String[] aliases,String url){
  if (url == null) {
    for (int i=0; i < aliases.length; i++) {
      if (aliases[i] != null) {
        return true;
      }
    }
  }
 else {
    for (int i=0; i < aliases.length; i++) {
      if (url.equals(aliases[i])) {
        return true;
      }
    }
  }
  return false;
}

}