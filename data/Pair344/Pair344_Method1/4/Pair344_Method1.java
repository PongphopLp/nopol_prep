import java.util.*;

public class Target {

boolean isSameDay(Date first,Date second){
  if (first == null || second == null) {
    return false;
  }
  if (first.equals(second)) {
    return true;
  }
  Calendar firstCal=new GregorianCalendar();
  firstCal.setTime(first);
  Calendar secondCal=new GregorianCalendar();
  secondCal.setTime(second);
  if (firstCal.get(Calendar.YEAR) == secondCal.get(Calendar.YEAR) && firstCal.get(Calendar.MONTH) == secondCal.get(Calendar.MONTH) && firstCal.get(Calendar.DAY_OF_MONTH) == secondCal.get(Calendar.DAY_OF_MONTH)) {
    return true;
  }
  return false;
}
  boolean __target__(Date first,Date second){
  if (first == null || second == null) {
    return false;
  }
  if (first.equals(second)) {
    return true;
  }
  Calendar firstCal=new GregorianCalendar();
  firstCal.setTime(first);
  Calendar secondCal=new GregorianCalendar();
  secondCal.setTime(second);
  if (firstCal.get(Calendar.YEAR) == secondCal.get(Calendar.YEAR) && firstCal.get(Calendar.MONTH) != secondCal.get(Calendar.MONTH) && firstCal.get(Calendar.DAY_OF_MONTH) == secondCal.get(Calendar.DAY_OF_MONTH)) {
    return true;
  }
  return false;
}

}