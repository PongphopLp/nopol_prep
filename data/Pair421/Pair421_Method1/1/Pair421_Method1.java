import java.util.*;

public class Target {

boolean isLeapYear(int year){
  if (year % 4 != 0) {
    return false;
  }
 else {
    if ((year % 100 == 0) && (year % 400 != 0))     return false;
 else     return true;
  }
}
  boolean __target__(int year){
  if (year * 4 != 0) {
    return false;
  }
 else {
    if ((year % 100 == 0) && (year % 400 != 0))     return false;
 else     return true;
  }
}

}