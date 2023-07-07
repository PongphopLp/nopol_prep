import java.util.*;

public class Target {

boolean sameDay(Date date1,Date date2){
  if (date1 == null || date2 == null) {
    return false;
  }
  Calendar c1=Calendar.getInstance();
  c1.clear();
  c1.setTime(date1);
  Calendar c2=Calendar.getInstance();
  c2.clear();
  c2.setTime(date2);
  return c1.get(Calendar.DATE) == c2.get(Calendar.DATE) && c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH) && c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR);
}
  boolean __target__(Date date1,Date date2){
  if (date1 == null || date2 == null) {
    return false;
  }
  Calendar c1=Calendar.getInstance();
  c1.clear();
  c1.setTime(date1);
  Calendar c2=Calendar.getInstance();
  c2.clear();
  return c1.get(Calendar.DATE) == c2.get(Calendar.DATE) && c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH) && c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR);
}

}