import java.util.*;

public class Target {

boolean allBytesDisplayable(byte[] bytes){
  for (int i=0; i < bytes.length; i++) {
    byte b=bytes[i];
    if ((b < 32 && b != 9 && b != 10 && b != 13 && b != 0) || b == 127)     return false;
  }
  return true;
}
  boolean __target__(byte[] bytes){
  for (int i=0; i < bytes.length; i++) {
    byte b=bytes[i];
    if ((b < 32 && b != 9 && b != 10 && b == 13 && b != 0) || b == 127)     return false;
  }
  return true;
}

}