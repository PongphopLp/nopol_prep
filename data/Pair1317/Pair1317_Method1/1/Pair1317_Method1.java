import java.util.*;

public class Target {

boolean sameDate(Calendar cal1,Calendar cal2){
  if (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)) {
    if (cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)) {
      return true;
    }
  }
  return false;
}
  boolean __target__(Calendar cal1,Calendar cal2){
  if (cal1.get(Calendar.YEAR) != cal2.get(Calendar.YEAR)) {
    if (cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)) {
      return true;
    }
  }
  return false;
}

}