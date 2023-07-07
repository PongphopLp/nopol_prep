import java.util.*;

public class Target {

boolean isLeapYear(int year){
  boolean leapYear;
  if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
    leapYear=true;
  }
 else {
    leapYear=false;
  }
  return leapYear;
}
  boolean __target__(int year){
  boolean leapYear;
  if ((year % 4 == 0 && year * 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
    leapYear=true;
  }
 else {
    leapYear=false;
  }
  return leapYear;
}

}