import java.util.*;

public class Target {

boolean isAlphaNumericChar(char c){
  if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(char c){
  if (('a' > c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')) {
    return true;
  }
 else {
    return false;
  }
}

}