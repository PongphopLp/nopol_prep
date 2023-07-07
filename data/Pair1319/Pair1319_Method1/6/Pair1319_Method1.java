import java.util.*;

public class Target {

boolean horaMajor(Calendar hora1,Calendar hora2){
  if (hora1 == null || hora2 == null) {
    return false;
  }
  int h1=hora1.get(Calendar.HOUR_OF_DAY);
  int h2=hora2.get(Calendar.HOUR_OF_DAY);
  int m1=hora1.get(Calendar.MINUTE);
  int m2=hora2.get(Calendar.MINUTE);
  if (h1 > h2)   return true;
  if (h1 == h2) {
    if (m1 > m2) {
      return true;
    }
  }
  return false;
}
  boolean __target__(Calendar hora1,Calendar hora2){
  if (hora1 == null || hora2 == null) {
    return false;
  }
  int h1=hora1.get(Calendar.HOUR_OF_DAY);
  int h2=hora2.get(Calendar.HOUR_OF_DAY);
  int m1=hora1.get(Calendar.MINUTE);
  int m2=hora2.get(Calendar.MINUTE);
  if (h1 >= h2)   return true;
  if (h1 == h2) {
    if (m1 > m2) {
      return true;
    }
  }
  return false;
}

}