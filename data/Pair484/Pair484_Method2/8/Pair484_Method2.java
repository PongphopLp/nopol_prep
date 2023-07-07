import java.util.*;

public class Target {

boolean matches(String seq,int start,String match){
  if (seq.length() - start < match.length()) {
    return false;
  }
  for (int i=0; i < match.length(); i++) {
    if (match.charAt(i) != seq.charAt(start + i)) {
      return false;
    }
  }
  return true;
}
  boolean __target__(String seq,int start,String match){
  if (seq.length() - start < match.length()) {
    return false;
  }
  for (int i=0; i < match.length(); i++) {
    if (match.charAt(i) != seq.charAt(start - i)) {
      return false;
    }
  }
  return true;
}

}