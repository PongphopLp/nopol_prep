import java.util.*;

public class Target {

boolean isMatched(int[] index){
  for (int i=1; i < index.length; i++) {
    if (index[i] != index[i - 1]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(int[] index){
  for (int i=1; i < index.length; i--) {
    if (index[i] != index[i - 1]) {
      return false;
    }
  }
  return true;
}

}