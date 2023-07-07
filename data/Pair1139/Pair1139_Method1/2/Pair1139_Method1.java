import java.util.*;

public class Target {

boolean isHexNumberPart(char c){
  if (('0' <= c) && (c <= '9'))   return true;
 else {
    c=Character.toLowerCase(c);
    if (('a' <= c) && (c <= 'f'))     return true;
  }
  return false;
}
  boolean __target__(char c){
  if (('0' <= c) && (c < '9'))   return true;
 else {
    c=Character.toLowerCase(c);
    if (('a' <= c) && (c <= 'f'))     return true;
  }
  return false;
}

}