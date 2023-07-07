import java.util.*;

public class Target {

String getMonths(Calendar aCalendar){
  String dateStamp="";
  int months=aCalendar.get(Calendar.MONTH) + 1;
  if (months < 10) {
    dateStamp+="0" + months;
  }
 else {
    dateStamp+=months;
  }
  return dateStamp;
}
  String __target__(Calendar aCalendar){
  String dateStamp="";
  int months=aCalendar.get(Calendar.MONTH) + 1;
  if (months >= 10) {
    dateStamp+="0" + months;
  }
 else {
    dateStamp+=months;
  }
  return dateStamp;
}

}