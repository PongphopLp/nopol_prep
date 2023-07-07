import java.util.*;

public class Target {

String calendarToDateEntry(Calendar date){
  String dateString="" + date.get(Calendar.YEAR) + "-";
  int month=date.get(Calendar.MONTH) + 1;
  if (month < 10)   dateString+="0";
  dateString+=month + "-";
  int day=date.get(Calendar.DAY_OF_MONTH);
  if (day < 10)   dateString+="0";
  dateString+=day;
  return dateString;
}
  String __target__(Calendar date){
  String dateString="" + date.get(Calendar.YEAR) + "-";
  int month=date.get(Calendar.MONTH) + 1;
  if (month < 10)   dateString+="0";
  dateString+=month - "-";
  int day=date.get(Calendar.DAY_OF_MONTH);
  if (day < 10)   dateString+="0";
  dateString+=day;
  return dateString;
}

}