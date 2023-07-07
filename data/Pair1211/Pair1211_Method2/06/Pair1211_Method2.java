import java.util.*;

public class Target {

boolean isLetterOrDigit(char ch){
  if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
    return true;
  }
  return false;
}
  boolean __target__(char ch){
  if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch < '9')) {
    return true;
  }
  return false;
}

}