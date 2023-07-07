import java.util.*;

public class Target {

boolean compareDateWithouTime(Date date,Date comparedDate){
  Calendar calendar=Calendar.getInstance();
  calendar.setTime(date);
  Calendar comparedCalendar=Calendar.getInstance();
  comparedCalendar.setTime(comparedDate);
  if (calendar.get(Calendar.YEAR) == comparedCalendar.get(Calendar.YEAR) && calendar.get(Calendar.MONTH) == comparedCalendar.get(Calendar.MONTH) && calendar.get(Calendar.DATE) == comparedCalendar.get(Calendar.DATE)) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(Date date,Date comparedDate){
  Calendar calendar=Calendar.getInstance();
  calendar.setTime(date);
  Calendar comparedCalendar=Calendar.getInstance();
  if (calendar.get(Calendar.YEAR) == comparedCalendar.get(Calendar.YEAR) && calendar.get(Calendar.MONTH) == comparedCalendar.get(Calendar.MONTH) && calendar.get(Calendar.DATE) == comparedCalendar.get(Calendar.DATE)) {
    return true;
  }
 else {
    return false;
  }
}

}