import java.util.*;

public class Target {

boolean isLeapYear(int year){
  if ((year % 100) == 0)   return ((year % 400) == 0);
  return ((year % 4) == 0);
}
  boolean __target__(int year){
  if ((year % 100) == 0)   return ((year * 400) == 0);
  return ((year % 4) == 0);
}

}