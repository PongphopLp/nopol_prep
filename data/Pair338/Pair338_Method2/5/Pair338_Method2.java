import java.util.*;

public class Target {

boolean isSameDate(Date date1,Date date2){
  if (date1 == null || date2 == null) {
    return false;
  }
  if (date1.getYear() == date2.getYear() && date1.getMonth() == date2.getMonth() && date1.getDate() == date2.getDate()) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(Date date1,Date date2){
  if (date1 == null || date2 == null) {
    return false;
  }
  if (date1.getYear() == date2.getYear() && date1.getMonth() == date2.getMonth() && date1.getDate() != date2.getDate()) {
    return true;
  }
 else {
    return false;
  }
}

}