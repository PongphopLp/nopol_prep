import java.util.*;

public class Target {

boolean inArray(String[] array,String string){
  for (int i=0; array != null && string != null && i < array.length; i++) {
    if (array[i].equals(string)) {
      return true;
    }
  }
  return false;
}
  boolean __target__(String[] array,String string){
  for (int i=0; array == null && string != null && i < array.length; i++) {
    if (array[i].equals(string)) {
      return true;
    }
  }
  return false;
}

}