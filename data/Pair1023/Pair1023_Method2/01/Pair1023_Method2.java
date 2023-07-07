import java.util.*;

public class Target {

String getDateString(Calendar date){
  StringBuffer sb=new StringBuffer();
  int year=date.get(Calendar.YEAR);
  for (int i=0; i < 4 - String.valueOf(year).length(); i++)   sb.append('0');
  sb.append(year).append('-');
  int month=date.get(Calendar.MONTH) + 1;
  if (month < 10)   sb.append('0');
  sb.append(month).append('-');
  int day=date.get(Calendar.DAY_OF_MONTH);
  if (day < 10)   sb.append('0');
  sb.append(day);
  return sb.toString();
}
  String __target__(Calendar date){
  StringBuffer sb=new StringBuffer();
  int year=date.get(Calendar.YEAR);
  for (int i=0; i <= 4 - String.valueOf(year).length(); i++)   sb.append('0');
  sb.append(year).append('-');
  int month=date.get(Calendar.MONTH) + 1;
  if (month < 10)   sb.append('0');
  sb.append(month).append('-');
  int day=date.get(Calendar.DAY_OF_MONTH);
  if (day < 10)   sb.append('0');
  sb.append(day);
  return sb.toString();
}

}