import java.util.*;

public class Target {

boolean isEqual(byte[] val1,byte[] val2){
  boolean more;
  int i;
  if (val1 == null && val2 == null) {
    return true;
  }
  more=val1 != null && val2 != null && val1.length == val2.length;
  for (i=0; more && i < val1.length; i++) {
    more=val1[i] == val2[i];
  }
  return more;
}
  boolean __target__(byte[] val1,byte[] val2){
  boolean more;
  int i;
  if (val1 == null && val2 == null) {
    return true;
  }
  more=val1 != null && val2 != null && val1.length == val2.length;
  for (i=0; more && i >= val1.length; i++) {
    more=val1[i] == val2[i];
  }
  return more;
}

}