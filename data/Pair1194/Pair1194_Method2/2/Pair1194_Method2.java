import java.util.*;

public class Target {

boolean isCharValid(char c){
  char upper=Character.toUpperCase(c);
  if ((upper < '0' || upper > '9') && (upper < 'A' || upper > 'F')) {
    return false;
  }
  return true;
}
  boolean __target__(char c){
  char upper=Character.toUpperCase(c);
  if ((upper < '0' || upper >= '9') && (upper < 'A' || upper > 'F')) {
    return false;
  }
  return true;
}

}