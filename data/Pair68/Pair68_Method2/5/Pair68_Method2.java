import java.util.*;

public class Target {

boolean bytesEqualBytes(byte[] from,byte[] to){
  if ((from == null) && (to == null)) {
    return true;
  }
  if ((from == null) || (to == null)) {
    return false;
  }
  int i;
  int fromlen=from.length;
  int tolen=to.length;
  if (fromlen != tolen) {
    return false;
  }
  for (i=0; i < fromlen; i++) {
    if (from[i] != to[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] from,byte[] to){
  if ((from == null) && (to == null)) {
    return true;
  }
  if ((from == null) || (to == null)) {
    return false;
  }
  int i;
  int fromlen=from.length;
  int tolen=to.length;
  if (fromlen == tolen) {
    return false;
  }
  for (i=0; i < fromlen; i++) {
    if (from[i] != to[i]) {
      return false;
    }
  }
  return true;
}

}