import java.util.*;

public class Target {

boolean isDateToday(Date date){
  Date today=new Date();
  if (date.getYear() == today.getYear() && date.getMonth() == today.getMonth() && date.getDate() == today.getDate()) {
    return true;
  }
  return false;
}
  boolean __target__(Date date){
  Date today=new Date();
  if (date.getYear() != today.getYear() && date.getMonth() == today.getMonth() && date.getDate() == today.getDate()) {
    return true;
  }
  return false;
}

}