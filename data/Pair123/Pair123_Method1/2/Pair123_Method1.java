import java.util.*;

public class Target {

boolean arrayEquals(byte[] signreq2,byte[] signres2){
  boolean retval=true;
  if (signreq2.length != signres2.length) {
    return false;
  }
  for (int i=0; i < signreq2.length; i++) {
    if (signreq2[i] != signres2[i]) {
      return false;
    }
  }
  return retval;
}
  boolean __target__(byte[] signreq2,byte[] signres2){
  boolean retval=true;
  if (signreq2.length != signres2.length) {
    return false;
  }
  for (int i=0; i <= signreq2.length; i++) {
    if (signreq2[i] != signres2[i]) {
      return false;
    }
  }
  return retval;
}

}