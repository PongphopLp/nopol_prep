import java.util.*;

public class Target {

Date max(Date date1,Date date2){
  if (date1 == null || date2 == null) {
    return null;
  }
  return date1.compareTo(date2) > 0 ? date1 : date2;
}
  Date __target__(Date date1,Date date2){
  if (date1 == null || date2 == null) {
    return null;
  }
  return date1.compareTo(date2) <= 0 ? date1 : date2;
}

}