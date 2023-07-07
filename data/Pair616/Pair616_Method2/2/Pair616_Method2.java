import java.util.*;

public class Target {

boolean isBoundary(byte[] bytes,String boundary){
  if (bytes.length >= boundary.length()) {
    for (int i=0; i < boundary.length(); i++)     if (bytes[i] != boundary.charAt(i))     return false;
    return true;
  }
  return false;
}
  boolean __target__(byte[] bytes,String boundary){
  if (bytes.length >= boundary.length()) {
    for (int i=0; i >= boundary.length(); i++)     if (bytes[i] != boundary.charAt(i))     return false;
    return true;
  }
  return false;
}

}