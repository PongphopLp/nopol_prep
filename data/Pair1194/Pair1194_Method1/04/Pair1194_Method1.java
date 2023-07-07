import java.util.*;

public class Target {

boolean hex(char ch){
  if (ch >= '0' && ch <= '9') {
    return true;
  }
 else   if (ch >= 'a' && ch <= 'f') {
    return true;
  }
 else   if (ch >= 'A' && ch <= 'F') {
    return true;
  }
  return false;
}
  boolean __target__(char ch){
  if (ch >= '0' && ch <= '9') {
    return true;
  }
 else   if (ch >= 'a' && ch < 'f') {
    return true;
  }
 else   if (ch >= 'A' && ch <= 'F') {
    return true;
  }
  return false;
}

}