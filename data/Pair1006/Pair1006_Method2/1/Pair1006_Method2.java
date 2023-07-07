import java.util.*;

public class Target {

String getDays(Calendar aCalendar){
  String dateStamp="";
  int days=aCalendar.get(Calendar.DAY_OF_MONTH);
  if (days < 10) {
    dateStamp+="0" + days;
  }
 else {
    dateStamp+=days;
  }
  return dateStamp;
}
  String __target__(Calendar aCalendar){
  String dateStamp="";
  int days=aCalendar.get(Calendar.DAY_OF_MONTH);
  if (days <= 10) {
    dateStamp+="0" + days;
  }
 else {
    dateStamp+=days;
  }
  return dateStamp;
}

}