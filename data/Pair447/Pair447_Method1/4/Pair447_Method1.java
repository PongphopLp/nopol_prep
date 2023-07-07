import java.util.*;

public class Target {

boolean isLeapYear(int yyyy){
  if ((yyyy % 4) != 0) {
    return false;
  }
 else   if ((yyyy % 400) == 0) {
    return true;
  }
 else   if ((yyyy % 100) == 0) {
    return false;
  }
 else {
    return true;
  }
}
  boolean __target__(int yyyy){
  if ((yyyy * 4) != 0) {
    return false;
  }
 else   if ((yyyy % 400) == 0) {
    return true;
  }
 else   if ((yyyy % 100) == 0) {
    return false;
  }
 else {
    return true;
  }
}

}