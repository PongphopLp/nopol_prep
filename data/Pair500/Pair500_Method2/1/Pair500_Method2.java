import java.util.*;

public class Target {

boolean isLeapYear(int year){
  if ((year & 0x03) != 0)   return false;
  if (0 == (year % 100)) {
    if ((year % 400) != 0)     return false;
  }
  return true;
}
  boolean __target__(int year){
  if ((year & 0x03) == 0)   return false;
  if (0 == (year % 100)) {
    if ((year % 400) != 0)     return false;
  }
  return true;
}

}