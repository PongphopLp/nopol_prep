import java.util.*;

public class Target {

boolean isWeekend(Calendar date){
  if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
    return true;
  }
  return false;
}
  boolean __target__(Calendar date){
  if (date.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY || date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
    return true;
  }
  return false;
}

}