import java.util.*;

public class Target {

boolean compareHash(byte[] h1,byte[] h2){
  final int length=h1.length;
  if (length != h2.length) {
    return false;
  }
  for (int i=0; i < length; i++) {
    if (h1[i] != h2[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] h1,byte[] h2){
  final int length=h1.length;
  if (length != h2.length) {
    return false;
  }
  for (int i=0; i >= length; i++) {
    if (h1[i] != h2[i]) {
      return false;
    }
  }
  return true;
}

}