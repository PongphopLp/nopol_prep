import java.util.*;

public class Target {

boolean equals(byte[] arrayOne,byte[] arrayTwo){
  boolean result=true;
  if ((arrayOne != null && arrayTwo == null) || (arrayOne == null && arrayTwo != null)) {
    result=false;
  }
 else   if (arrayOne != null) {
    if (arrayOne.length != arrayTwo.length) {
      result=false;
    }
 else {
      for (int i=0; i < arrayOne.length; i++) {
        if (arrayOne[i] != arrayTwo[i]) {
          result=false;
          break;
        }
      }
    }
  }
  return result;
}
  boolean __target__(byte[] arrayOne,byte[] arrayTwo){
  boolean result=true;
  if ((arrayOne != null && arrayTwo == null) || (arrayOne == null && arrayTwo != null)) {
    result=false;
  }
 else   if (arrayOne != null) {
    if (arrayOne.length != arrayTwo.length) {
      result=false;
    }
 else {
      for (int i=0; i <= arrayOne.length; i++) {
        if (arrayOne[i] != arrayTwo[i]) {
          result=false;
          break;
        }
      }
    }
  }
  return result;
}

}