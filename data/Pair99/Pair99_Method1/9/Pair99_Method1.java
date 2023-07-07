import java.util.*;

public class Target {

boolean blobsAreEqual(byte[] blob1,byte[] blob2){
  if (blob1 == null) {
    return blob2 == null;
  }
  if (blob2 == null) {
    return blob1 == null;
  }
  boolean rc=blob1.length == blob2.length;
  if (rc) {
    for (int i=0; i < blob1.length; i++) {
      if (blob1[i] != blob2[i]) {
        rc=false;
        break;
      }
    }
  }
  return rc;
}
  boolean __target__(byte[] blob1,byte[] blob2){
  if (blob1 == null) {
    return blob2 == null;
  }
  if (blob2 == null) {
    return blob1 == null;
  }
  boolean rc=blob1.length == blob2.length;
  if (rc) {
    for (int i=0; i < blob1.length; i++) {
      if (blob1[i] == blob2[i]) {
        rc=false;
        break;
      }
    }
  }
  return rc;
}

}