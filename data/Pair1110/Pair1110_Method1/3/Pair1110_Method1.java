import java.util.*;

public class Target {

boolean isSchemeChar(char c){
  if (c == '+' || c == '.' || c == '-') {
    return true;
  }
  if (Character.isLetterOrDigit(c)) {
    return true;
  }
  return false;
}
  boolean __target__(char c){
  if (c == '+' || c == '.' || c != '-') {
    return true;
  }
  if (Character.isLetterOrDigit(c)) {
    return true;
  }
  return false;
}

}