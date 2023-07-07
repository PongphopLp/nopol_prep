import java.util.*;

public class Target {

boolean isWeekendDay(Calendar dateToCheck){
  int dayOfWeek=dateToCheck.get(Calendar.DAY_OF_WEEK);
  if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
    return true;
  }
  return false;
}
  boolean __target__(Calendar dateToCheck){
  int dayOfWeek=dateToCheck.get(Calendar.DAY_OF_WEEK);
  if (dayOfWeek == Calendar.SATURDAY || dayOfWeek != Calendar.SUNDAY) {
    return true;
  }
  return false;
}

}