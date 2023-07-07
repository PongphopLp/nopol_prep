import java.util.*;

public class Target {

boolean isToday(Date aDate){
  Calendar aCal1=Calendar.getInstance();
  aCal1.setTime(aDate);
  Calendar aCal2=Calendar.getInstance();
  if ((aCal1.get(Calendar.DATE) == aCal2.get(Calendar.DATE)) && (aCal1.get(Calendar.YEAR) == aCal2.get(Calendar.YEAR)) && (aCal1.get(Calendar.MONTH) == aCal2.get(Calendar.MONTH))) {
    return (true);
  }
 else {
    return (false);
  }
}
  boolean __target__(Date aDate){
  Calendar aCal1=Calendar.getInstance();
  aCal1.setTime(aDate);
  Calendar aCal2=Calendar.getInstance();
  if ((aCal1.get(Calendar.DATE) != aCal2.get(Calendar.DATE)) && (aCal1.get(Calendar.YEAR) == aCal2.get(Calendar.YEAR)) && (aCal1.get(Calendar.MONTH) == aCal2.get(Calendar.MONTH))) {
    return (true);
  }
 else {
    return (false);
  }
}

}