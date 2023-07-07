import java.util.*;

public class Target {

boolean equals(boolean[] arrayOne,boolean[] arrayTwo){
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
  boolean __target__(boolean[] arrayOne,boolean[] arrayTwo){
  boolean result=true;
  if ((arrayOne != null && arrayTwo == null) || (arrayOne != null && arrayTwo != null)) {
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

}