import java.util.*;

public class Target {

boolean isSameDay(Date d1,Date d2){
  if (d1 == null || d2 == null)   return false;
  GregorianCalendar cal1=new GregorianCalendar();
  cal1.setTime(d1);
  GregorianCalendar cal2=new GregorianCalendar();
  cal2.setTime(d2);
  if (cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR))   if (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR))   return true;
  return false;
}
  boolean __target__(Date d1,Date d2){
  if (d1 == null || d2 == null)   return false;
  GregorianCalendar cal1=new GregorianCalendar();
  GregorianCalendar cal2=new GregorianCalendar();
  cal2.setTime(d2);
  if (cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR))   if (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR))   return true;
  return false;
}

}