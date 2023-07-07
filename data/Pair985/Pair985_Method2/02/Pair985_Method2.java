import java.util.*;

public class Target {

String getYYYYMMDD(GregorianCalendar gc){
  String day="";
  if (gc.get(Calendar.DAY_OF_MONTH) < 10)   day="0" + (gc.get(Calendar.DAY_OF_MONTH));
 else   day+=(gc.get(Calendar.DAY_OF_MONTH));
  String month="";
  if (gc.get(Calendar.MONTH) + 1 < 10)   month="0" + (gc.get(Calendar.MONTH) + 1);
 else   month+=(gc.get(Calendar.MONTH) + 1);
  return gc.get(Calendar.YEAR) + "-" + month+ "-"+ day;
}
  String __target__(GregorianCalendar gc){
  String day="";
  if (gc.get(Calendar.DAY_OF_MONTH) < 10)   day="0" + (gc.get(Calendar.DAY_OF_MONTH));
 else   day+=(gc.get(Calendar.DAY_OF_MONTH));
  String month="";
  if (gc.get(Calendar.MONTH) + 1 <= 10)   month="0" + (gc.get(Calendar.MONTH) + 1);
 else   month+=(gc.get(Calendar.MONTH) + 1);
  return gc.get(Calendar.YEAR) + "-" + month+ "-"+ day;
}

}