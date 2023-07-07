import java.util.*;

public class Target {

boolean isLeapYear(int i){
  if (i % 4 != 0) {
    return false;
  }
  if (i % 400 == 0) {
    return true;
  }
  if (i % 100 == 0) {
    return false;
  }
  return true;
}
  boolean __target__(int i){
  if (i % 4 != 0) {
    return false;
  }
  if (i * 400 == 0) {
    return true;
  }
  if (i % 100 == 0) {
    return false;
  }
  return true;
}

}