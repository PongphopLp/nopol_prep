import java.util.*;

public class Target {

boolean startsWith(byte[] val,byte[] msg,int off){
  if (val.length + off > msg.length) {
    return false;
  }
  for (int i=0; i < val.length; i++) {
    if (val[i] != msg[i + off]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] val,byte[] msg,int off){
  if (val.length + off <= msg.length) {
    return false;
  }
  for (int i=0; i < val.length; i++) {
    if (val[i] != msg[i + off]) {
      return false;
    }
  }
  return true;
}

}