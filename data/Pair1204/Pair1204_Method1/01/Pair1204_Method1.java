import java.util.*;

public class Target {

boolean isAlphaNumeric(char ch){
  if ((ch >= '0') && (ch <= '9')) {
    return true;
  }
  if ((ch >= 'A') && (ch <= 'Z')) {
    return true;
  }
  if ((ch >= 'a') && (ch <= 'z')) {
    return true;
  }
  return false;
}
  boolean __target__(char ch){
  if ((ch < '0') && (ch <= '9')) {
    return true;
  }
  if ((ch >= 'A') && (ch <= 'Z')) {
    return true;
  }
  if ((ch >= 'a') && (ch <= 'z')) {
    return true;
  }
  return false;
}

}