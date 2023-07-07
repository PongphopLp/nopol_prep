import java.util.*;

public class Target {

boolean isSameDay(Calendar one,Calendar two){
  if (one != null && two != null) {
    if (one.get(Calendar.YEAR) == two.get(Calendar.YEAR) && one.get(Calendar.DAY_OF_YEAR) == two.get(Calendar.DAY_OF_YEAR)) {
      return true;
    }
  }
  return false;
}
  boolean __target__(Calendar one,Calendar two){
  if (one != null && two != null) {
    if (one.get(Calendar.YEAR) != two.get(Calendar.YEAR) && one.get(Calendar.DAY_OF_YEAR) == two.get(Calendar.DAY_OF_YEAR)) {
      return true;
    }
  }
  return false;
}

}