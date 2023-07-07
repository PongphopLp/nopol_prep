import java.util.*;

public class Target {

boolean startsWith(byte[] bytes,byte[] lookFor){
  if (bytes.length < lookFor.length) {
    return false;
  }
  for (int i=0; i < lookFor.length; ++i) {
    if (bytes[i] != lookFor[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] bytes,byte[] lookFor){
  if (bytes.length < lookFor.length) {
    return false;
  }
  for (int i=0; i < lookFor.length; --i) {
    if (bytes[i] != lookFor[i]) {
      return false;
    }
  }
  return true;
}

}