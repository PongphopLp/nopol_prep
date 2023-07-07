import java.util.*;

public class Target {

boolean isLeapYear(int year){
  boolean leap=false;
  if (year % 4 == 0) {
    if (year % 100 == 0) {
      if (year % 400 == 0) {
        leap=true;
      }
    }
 else {
      leap=true;
    }
  }
  return leap;
}
  boolean __target__(int year){
  boolean leap=false;
  if (year % 4 == 0) {
    if (year % 100 != 0) {
      if (year % 400 == 0) {
        leap=true;
      }
    }
 else {
      leap=true;
    }
  }
  return leap;
}

}