import java.util.*;

public class Target {

boolean allBytesDisplayable(byte[] bytes){
  for (  byte b : bytes) {
    if ((b < 32 && b != 9 && b != 10 && b != 13 && b != 0) || b == 127) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] bytes){
  for (  byte b : bytes) {
    if ((b >= 32 && b != 9 && b != 10 && b != 13 && b != 0) || b == 127) {
      return false;
    }
  }
  return true;
}

}