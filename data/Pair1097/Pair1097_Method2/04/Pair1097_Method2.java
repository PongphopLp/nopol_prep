import java.util.*;

public class Target {

boolean isValid(char c){
  if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')) || ((c >= '0') && (c <= '9'))) {
    return true;
  }
 else   return false;
}
  boolean __target__(char c){
  if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c < 'Z')) || ((c >= '0') && (c <= '9'))) {
    return true;
  }
 else   return false;
}

}