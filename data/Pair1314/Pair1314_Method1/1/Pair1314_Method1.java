import java.util.*;

public class Target {

boolean compareCalendar(Calendar _cal1,Calendar _cal2){
  if (_cal1 != null && _cal2 != null) {
    int year1=_cal1.get(Calendar.YEAR);
    int month1=_cal1.get(Calendar.MONTH);
    int day1=_cal1.get(Calendar.DAY_OF_MONTH);
    int year2=_cal2.get(Calendar.YEAR);
    int month2=_cal2.get(Calendar.MONTH);
    int day2=_cal2.get(Calendar.DAY_OF_MONTH);
    return year1 == year2 && month1 == month2 && day1 == day2;
  }
  return false;
}
  boolean __target__(Calendar _cal1,Calendar _cal2){
  if (_cal1 == null && _cal2 != null) {
    int year1=_cal1.get(Calendar.YEAR);
    int month1=_cal1.get(Calendar.MONTH);
    int day1=_cal1.get(Calendar.DAY_OF_MONTH);
    int year2=_cal2.get(Calendar.YEAR);
    int month2=_cal2.get(Calendar.MONTH);
    int day2=_cal2.get(Calendar.DAY_OF_MONTH);
    return year1 == year2 && month1 == month2 && day1 == day2;
  }
  return false;
}

}