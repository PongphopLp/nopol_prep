import java.util.*;

public class Target {

boolean isLeapYear(int year){
  boolean isDivisibleBy4=(year & 0x3) == 0;
  if (isDivisibleBy4) {
    boolean isCenturyYear=(year % 100 == 0);
    boolean isDivisibleBy400=(year % 400 == 0);
    return !(isCenturyYear && !isDivisibleBy400);
  }
 else {
    return false;
  }
}
  boolean __target__(int year){
  boolean isDivisibleBy4=(year & 0x3) == 0;
  if (isDivisibleBy4) {
    boolean isCenturyYear=(year % 100 == 0);
    boolean isDivisibleBy400=(year * 400 == 0);
    return !(isCenturyYear && !isDivisibleBy400);
  }
 else {
    return false;
  }
}

}