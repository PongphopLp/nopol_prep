import java.util.*;

public class Target {

int compDates(Calendar d1,Calendar d2){
  int day1=d1.get(Calendar.DATE);
  int month1=d1.get(Calendar.MONTH);
  int year1=d1.get(Calendar.YEAR);
  int day2=d2.get(Calendar.DATE);
  int month2=d2.get(Calendar.MONTH);
  int year2=d2.get(Calendar.YEAR);
  if (year1 != year2)   return year1 - year2;
  if (month1 != month2)   return month1 - month2;
  if (day1 != day2)   return day1 - day2;
  return 0;
}
  int __target__(Calendar d1,Calendar d2){
  int day1=d1.get(Calendar.DATE);
  int month1=d1.get(Calendar.MONTH);
  int year1=d1.get(Calendar.YEAR);
  int day2=d2.get(Calendar.DATE);
  int month2=d2.get(Calendar.MONTH);
  int year2=d2.get(Calendar.YEAR);
  if (year1 == year2)   return year1 - year2;
  if (month1 != month2)   return month1 - month2;
  if (day1 != day2)   return day1 - day2;
  return 0;
}

}