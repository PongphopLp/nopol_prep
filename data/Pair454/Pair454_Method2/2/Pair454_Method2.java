import java.util.*;

public class Target {

boolean valueDiffers(String r,String c){
  if (r == null && c == null) {
    return false;
  }
  if (r != null && c != null) {
    return !r.equals(c);
  }
  return true;
}
  boolean __target__(String r,String c){
  if (r == null && c != null) {
    return false;
  }
  if (r != null && c != null) {
    return !r.equals(c);
  }
  return true;
}

}