import java.util.*;

public class Target {

boolean isIn(Object[] list,Object value){
  boolean result=false;
  if ((list != null) && (value != null)) {
    for (int i=0; i < list.length; i++) {
      if (list[i].equals(value)) {
        result=true;
        break;
      }
    }
  }
  return result;
}
  boolean __target__(Object[] list,Object value){
  boolean result=false;
  if ((list == null) && (value != null)) {
    for (int i=0; i < list.length; i++) {
      if (list[i].equals(value)) {
        result=true;
        break;
      }
    }
  }
  return result;
}

}