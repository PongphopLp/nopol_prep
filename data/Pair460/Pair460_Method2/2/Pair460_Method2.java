import java.util.*;

public class Target {

boolean isLeapYear(int year){
  boolean result=false;
  if (((year % 4) == 0) && (((year % 100) != 0) || ((year % 400) == 0))) {
    result=true;
  }
  return result;
}
  boolean __target__(int year){
  boolean result=false;
  if (((year % 4) == 0) && (((year * 100) != 0) || ((year % 400) == 0))) {
    result=true;
  }
  return result;
}

}