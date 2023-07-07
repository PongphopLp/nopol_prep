import java.util.*;

public class Target {

boolean isAlpha(char c){
  if ((c >= 'a') && (c <= 'z'))   return true;
  if ((c >= 'A') && (c <= 'Z'))   return true;
  if (c == '_') {
    return true;
  }
  return false;
}
  boolean __target__(char c){
  if ((c >= 'a') && (c <= 'z'))   return true;
  if ((c >= 'A') && (c <= 'Z'))   return true;
  if (c != '_') {
    return true;
  }
  return false;
}

}