import java.util.*;

public class Target {

boolean areEqualDates(Calendar date1,Calendar date2){
  if (date1 == null || date2 == null) {
    return false;
  }
  if (date1.get(Calendar.YEAR) != date2.get(Calendar.YEAR)) {
    return false;
  }
  if (date1.get(Calendar.MONTH) != date2.get(Calendar.MONTH)) {
    return false;
  }
  if (date1.get(Calendar.DAY_OF_MONTH) != date2.get(Calendar.DAY_OF_MONTH)) {
    return false;
  }
  return true;
}
  boolean __target__(Calendar date1,Calendar date2){
  if (date1 == null || date2 == null) {
    return false;
  }
  if (date1.get(Calendar.YEAR) != date2.get(Calendar.YEAR)) {
    return false;
  }
  if (date1.get(Calendar.MONTH) != date2.get(Calendar.MONTH)) {
    return false;
  }
  if (date1.get(Calendar.DAY_OF_MONTH) == date2.get(Calendar.DAY_OF_MONTH)) {
    return false;
  }
  return true;
}

}