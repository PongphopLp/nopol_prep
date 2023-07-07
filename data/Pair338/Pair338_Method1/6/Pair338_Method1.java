import java.util.*;

public class Target {

boolean isSameDay(Date date1,Date date2){
  if (date1 == null || date2 == null)   return false;
  Calendar cal=Calendar.getInstance();
  cal.setTime(date1);
  int year=cal.get(Calendar.YEAR);
  int month=cal.get(Calendar.MONTH);
  int day=cal.get(Calendar.DAY_OF_MONTH);
  cal.setTime(date2);
  return year == cal.get(Calendar.YEAR) && month == cal.get(Calendar.MONTH) && day == cal.get(Calendar.DAY_OF_MONTH);
}
  boolean __target__(Date date1,Date date2){
  if (date1 == null || date2 == null)   return false;
  Calendar cal=Calendar.getInstance();
  cal.setTime(date1);
  int year=cal.get(Calendar.YEAR);
  int month=cal.get(Calendar.MONTH);
  int day=cal.get(Calendar.DAY_OF_MONTH);
  cal.setTime(date2);
  return year == cal.get(Calendar.YEAR) && month != cal.get(Calendar.MONTH) && day == cal.get(Calendar.DAY_OF_MONTH);
}

}