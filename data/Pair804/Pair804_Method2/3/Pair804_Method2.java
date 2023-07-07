import java.util.*;

public class Target {

boolean existInArray(int[] okItem,int max,int value){
  for (int k=0; k < max; k++) {
    if (value == okItem[k]) {
      return true;
    }
  }
  return false;
}
  boolean __target__(int[] okItem,int max,int value){
  for (int k=0; k <= max; k++) {
    if (value == okItem[k]) {
      return true;
    }
  }
  return false;
}

}