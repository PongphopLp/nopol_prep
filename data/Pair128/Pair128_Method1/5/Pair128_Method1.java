import java.util.*;

public class Target {

boolean checkCommand(byte[] bcommand,byte[] brecieved){
  if (bcommand.length == brecieved.length) {
    for (int i=0; i < bcommand.length; i++) {
      if (bcommand[i] != brecieved[i]) {
        return false;
      }
    }
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(byte[] bcommand,byte[] brecieved){
  if (bcommand.length == brecieved.length) {
    for (int i=0; i < bcommand.length; i++) {
      if (bcommand[i] == brecieved[i]) {
        return false;
      }
    }
    return true;
  }
 else {
    return false;
  }
}

}