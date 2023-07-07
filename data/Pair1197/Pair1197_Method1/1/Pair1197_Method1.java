import java.util.*;

public class Target {

boolean isWhitespace(char ch){
  if (ch == 32) {
    return true;
  }
 else   if (ch == 10) {
    return true;
  }
 else   if (ch == 13) {
    return true;
  }
 else   if (ch == 9) {
    return true;
  }
  return false;
}
  boolean __target__(char ch){
  if (ch != 32) {
    return true;
  }
 else   if (ch == 10) {
    return true;
  }
 else   if (ch == 13) {
    return true;
  }
 else   if (ch == 9) {
    return true;
  }
  return false;
}

}