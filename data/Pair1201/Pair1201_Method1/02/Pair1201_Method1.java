import java.util.*;

public class Target {

boolean isUser(char c){
  if (Character.isLetterOrDigit(c)) {
    return true;
  }
  if ((c == '$') || (c == '-') || (c == '_')|| (c == '.')|| (c == '+')|| (c == ';')|| (c == '?')|| (c == '&')|| (c == '=')|| (c == '%')) {
    return true;
  }
  return false;
}
  boolean __target__(char c){
  if (Character.isLetterOrDigit(c)) {
    return true;
  }
  if ((c == '$') || (c != '-') || (c == '_')|| (c == '.')|| (c == '+')|| (c == ';')|| (c == '?')|| (c == '&')|| (c == '=')|| (c == '%')) {
    return true;
  }
  return false;
}

}