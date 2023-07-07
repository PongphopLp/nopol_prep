import java.util.*;

public class Target {

boolean isLeapYear(int year){
  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))   return true;
 else   return false;
}
  boolean __target__(int year){
  if ((year % 4 == 0 && year % 100 == 0) || (year % 400 == 0))   return true;
 else   return false;
}

}