import java.util.*;

public class Target {

boolean isProto(char c){
  if (Character.isLetterOrDigit(c)) {
    return true;
  }
  if ((c == '+') || (c == '-') || (c == '.')) {
    return true;
  }
  return false;
}
  boolean __target__(char c){
  if (Character.isLetterOrDigit(c)) {
    return true;
  }
  if ((c != '+') || (c == '-') || (c == '.')) {
    return true;
  }
  return false;
}

}