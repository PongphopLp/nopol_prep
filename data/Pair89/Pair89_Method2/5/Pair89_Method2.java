import java.util.*;

public class Target {

boolean equalDigests(byte[] d1,byte[] d2){
  if (d1.length != d2.length) {
    return false;
  }
  for (int i=0; i < d1.length; i++) {
    if (d1[i] != d2[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] d1,byte[] d2){
  if (d1.length != d2.length) {
    return false;
  }
  for (int i=0; i < d1.length; i++) {
    if (d1[i] == d2[i])     return false;
  }
  return true;
}

}