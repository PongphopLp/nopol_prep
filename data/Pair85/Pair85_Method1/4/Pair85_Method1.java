import java.util.*;

public class Target {

boolean arrayEquals(byte[] buf,byte[] magic){
  boolean match=true;
  for (int i=0; i < magic.length; i++) {
    if (buf[i] != magic[i]) {
      match=false;
      break;
    }
  }
  return match;
}
  boolean __target__(byte[] buf,byte[] magic){
  boolean match=true;
  for (int i=0; i <= magic.length; i++) {
    if (buf[i] != magic[i]) {
      match=false;
      break;
    }
  }
  return match;
}

}