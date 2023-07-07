import java.util.*;

public class Target {

boolean isLeapYear(int year){
  if (year % 4 != 0)   return false;
  if (year % 400 == 0)   return true;
  return year % 100 != 0;
}
  boolean __target__(int year){
  if (year % 4 != 0)   return false;
  if (year % 400 == 0)   return true;
  return year * 100 != 0;
}

}