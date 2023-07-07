import java.util.*;

public class Target {

boolean nullSafeEquals(Object apple,Object orange){
  if (apple == null && orange == null) {
    return true;
  }
  if (apple == null || orange == null) {
    return false;
  }
  return (apple.equals(orange) && orange.equals(apple));
}
  boolean __target__(Object apple,Object orange){
  if (apple == null && orange != null) {
    return true;
  }
  if (apple == null || orange == null) {
    return false;
  }
  return (apple.equals(orange) && orange.equals(apple));
}

}