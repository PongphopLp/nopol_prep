import java.util.*;

public class Target {

String datestamp(Calendar calendar){
  int year=calendar.get(Calendar.YEAR);
  int month=calendar.get(Calendar.MONTH) + 1;
  int day=calendar.get(Calendar.DAY_OF_MONTH);
  StringBuffer sb=new StringBuffer();
  if (year < 1000) {
    sb.append('0');
    if (year < 100) {
      sb.append('0');
      if (year < 10) {
        sb.append('0');
      }
    }
  }
  sb.append(Integer.toString(year));
  sb.append('-');
  if (month < 10) {
    sb.append('0');
  }
  sb.append(Integer.toString(month));
  sb.append('-');
  if (day < 10) {
    sb.append('0');
  }
  sb.append(Integer.toString(day));
  return sb.toString();
}
  String __target__(Calendar calendar){
  int year=calendar.get(Calendar.YEAR);
  int month=calendar.get(Calendar.MONTH) + 1;
  int day=calendar.get(Calendar.DAY_OF_MONTH);
  StringBuffer sb=new StringBuffer();
  if (year < 1000) {
    if (year < 100) {
      sb.append('0');
      if (year < 10) {
        sb.append('0');
      }
    }
  }
  sb.append(Integer.toString(year));
  sb.append('-');
  if (month < 10) {
    sb.append('0');
  }
  sb.append(Integer.toString(month));
  sb.append('-');
  if (day < 10) {
    sb.append('0');
  }
  sb.append(Integer.toString(day));
  return sb.toString();
}

}