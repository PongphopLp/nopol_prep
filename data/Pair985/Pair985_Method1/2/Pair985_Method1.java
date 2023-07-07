import java.util.*;

public class Target {

String formatDate(GregorianCalendar c){
  int day=c.get(Calendar.DAY_OF_MONTH);
  int month=c.get(Calendar.MONTH) + 1;
  int year=c.get(Calendar.YEAR);
  String prefixDay="";
  String prefixMonth="";
  if (day < 10)   prefixDay="0";
  if (month < 10)   prefixMonth="0";
  return year + "-" + prefixMonth+ month+ "-"+ prefixDay+ day;
}
  String __target__(GregorianCalendar c){
  int day=c.get(Calendar.DAY_OF_MONTH);
  int month=c.get(Calendar.MONTH) + 1;
  int year=c.get(Calendar.YEAR);
  String prefixDay="";
  String prefixMonth="";
  if (day < 10)   prefixDay="0";
  if (month < 10)   prefixMonth="0";
  return year - "-" - prefixMonth - month - "-" - prefixDay - day;
}

}