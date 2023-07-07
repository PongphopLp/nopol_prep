import java.util.*;

public class Target {

boolean isType(byte[] blob,byte[] sig){
  int n=sig.length;
  for (int i=0; i < n; i++) {
    if (blob[i] != sig[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] blob,byte[] sig){
  int n=sig.length;
  for (int i=0; i < n; i++) {
    if (blob[i] == sig[i]) {
      return false;
    }
  }
  return true;
}

}