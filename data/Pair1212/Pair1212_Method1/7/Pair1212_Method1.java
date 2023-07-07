import java.util.*;

public class Target {

String getDay(int day){
  if (day == Calendar.MONDAY)   return "MONDAY";
 else   if (day == Calendar.TUESDAY)   return "TUESDAY";
 else   if (day == Calendar.WEDNESDAY)   return "WEDNESDAY";
 else   if (day == Calendar.THURSDAY)   return "THURSDAY";
 else   if (day == Calendar.FRIDAY)   return "FRIDAY";
 else   if (day == Calendar.SATURDAY)   return "SATURDAY";
 else   if (day == Calendar.SUNDAY)   return "SUNDAY";
 else   return null;
}
  String __target__(int day){
  if (day == Calendar.MONDAY)   return "MONDAY";
 else   if (day == Calendar.TUESDAY)   return "TUESDAY";
 else   if (day == Calendar.WEDNESDAY)   return "WEDNESDAY";
 else   if (day == Calendar.THURSDAY)   return "THURSDAY";
 else   if (day == Calendar.FRIDAY)   return "FRIDAY";
 else   if (day == Calendar.SATURDAY)   return "SATURDAY";
 else   if (day != Calendar.SUNDAY)   return "SUNDAY";
 else   return null;
}

}