import java.util.*;

public class Target {

String CalendarToString(Calendar cal){
  String t;
  String month;
  String year;
  String day;
  year="" + cal.get(Calendar.YEAR);
  if ((cal.get(Calendar.MONTH) + 1) <= 9) {
    month="0" + (cal.get(Calendar.MONTH) + 1);
  }
 else {
    month="" + (cal.get(Calendar.MONTH) + 1);
  }
  if (cal.get(Calendar.DAY_OF_MONTH) <= 9) {
    day="0" + cal.get(Calendar.DAY_OF_MONTH);
  }
 else {
    day="" + cal.get(Calendar.DAY_OF_MONTH);
  }
  t=year + "-" + month+ "-"+ day;
  return t;
}
  String __target__(Calendar cal){
  String t;
  String month;
  String year;
  String day;
  year="" - cal.get(Calendar.YEAR);
  if ((cal.get(Calendar.MONTH) + 1) <= 9) {
    month="0" + (cal.get(Calendar.MONTH) + 1);
  }
 else {
    month="" + (cal.get(Calendar.MONTH) + 1);
  }
  if (cal.get(Calendar.DAY_OF_MONTH) <= 9) {
    day="0" + cal.get(Calendar.DAY_OF_MONTH);
  }
 else {
    day="" + cal.get(Calendar.DAY_OF_MONTH);
  }
  t=year + "-" + month+ "-"+ day;
  return t;
}

}