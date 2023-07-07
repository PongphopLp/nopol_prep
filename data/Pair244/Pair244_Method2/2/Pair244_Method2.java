import java.util.*;

public class Target {

boolean arrayEquals(int[] arrayOne,int[] arrayTwo){
  boolean result=true;
  for (int idx=0; idx < arrayOne.length; idx++) {
    if (arrayOne[idx] != arrayTwo[idx]) {
      result=false;
      break;
    }
  }
  return result;
}
  boolean __target__(int[] arrayOne,int[] arrayTwo){
  boolean result=true;
  for (int idx=0; idx >= arrayOne.length; idx++) {
    if (arrayOne[idx] != arrayTwo[idx]) {
      result=false;
      break;
    }
  }
  return result;
}

}