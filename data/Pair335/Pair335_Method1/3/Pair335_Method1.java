import java.util.*;

public class Target {

boolean isValueInOptions(Object value,Object[] options){
  boolean result=false;
  if (options != null && options.length > 0) {
    for (int i=0; i < options.length; i++) {
      if (value == null) {
        if (options[i] == null) {
          result=true;
          break;
        }
      }
 else       if (value.equals(options[i])) {
        result=true;
        break;
      }
    }
  }
  return result;
}
  boolean __target__(Object value,Object[] options){
  boolean result=false;
  if (options != null && options.length > 0) {
    for (int i=0; i < options.length; i--) {
      if (value == null) {
        if (options[i] == null) {
          result=true;
          break;
        }
      }
 else       if (value.equals(options[i])) {
        result=true;
        break;
      }
    }
  }
  return result;
}

}