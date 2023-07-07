import java.util.*;

public class Target {

boolean compare(short[] pOne,short[] pTwo){
  boolean ret=false;
  if (pOne == null && pTwo == null) {
    ret=true;
  }
 else   if (pOne == null || pTwo == null) {
    ret=false;
  }
 else {
    ret=(pOne.length == pTwo.length);
    if (ret) {
      for (int i=0; i < pOne.length; i++) {
        if (pOne[i] != pTwo[i]) {
          ret=false;
          break;
        }
      }
    }
  }
  return ret;
}
  boolean __target__(short[] pOne,short[] pTwo){
  boolean ret=false;
  if (pOne == null && pTwo == null) {
    ret=true;
  }
 else   if (pOne == null || pTwo == null) {
    ret=false;
  }
 else {
    ret=(pOne.length == pTwo.length);
    if (ret) {
      for (int i=0; i <= pOne.length; i++) {
        if (pOne[i] != pTwo[i]) {
          ret=false;
          break;
        }
      }
    }
  }
  return ret;
}

}