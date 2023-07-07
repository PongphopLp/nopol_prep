import java.util.*;

public class Target {

boolean equalsDateNullValue(Date d1,Date d2){
  if (d1 != null && d2 == null) {
    return false;
  }
  if (d1 == null && d2 != null) {
    return false;
  }
  if (d1 != null) {
    if (d2 == null) {
      return false;
    }
    return (d1.compareTo(d2) == 0);
  }
  return true;
}
  boolean __target__(Date d1,Date d2){
  if (d1 == null && d2 == null) {
    return false;
  }
  if (d1 == null && d2 != null) {
    return false;
  }
  if (d1 != null) {
    if (d2 == null) {
      return false;
    }
    return (d1.compareTo(d2) == 0);
  }
  return true;
}

}