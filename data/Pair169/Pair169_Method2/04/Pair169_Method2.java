import java.util.*;

public class Target {

boolean containsOmni(byte[] buffer){
  int index;
  for (index=buffer.length - 4; index >= 0; index--) {
    if ((0x6f == buffer[index]) && (0x6d == buffer[index + 1]) && (0x6e == buffer[index + 2])&& (0x69 == buffer[index + 3])) {
      return true;
    }
  }
  return false;
}
  boolean __target__(byte[] buffer){
  int index;
  for (index=buffer.length - 4; index >= 0; index--) {
    if ((0x6f == buffer[index]) && (0x6d == buffer[index + 1]) && (0x6e != buffer[index + 2])&& (0x69 == buffer[index + 3])) {
      return true;
    }
  }
  return false;
}

}