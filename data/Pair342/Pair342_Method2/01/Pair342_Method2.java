import java.util.*;

public class Target {

boolean isSameDay(Date a,Date b){
  Calendar c=Calendar.getInstance();
  Calendar c2=Calendar.getInstance();
  c.setTime(a);
  c2.setTime(b);
  c.set(Calendar.MILLISECOND,0);
  c.set(Calendar.SECOND,0);
  c.set(Calendar.MINUTE,0);
  c.set(Calendar.HOUR,0);
  c2.set(Calendar.MILLISECOND,0);
  c2.set(Calendar.SECOND,0);
  c2.set(Calendar.MINUTE,0);
  c2.set(Calendar.HOUR,0);
  if (c2.get(Calendar.YEAR) == c.get(Calendar.YEAR)) {
    if (c2.get(Calendar.MONTH) == c.get(Calendar.MONTH)) {
      if (c2.get(Calendar.DAY_OF_MONTH) == c.get(Calendar.DAY_OF_MONTH)) {
        return true;
      }
    }
  }
  return false;
}
  boolean __target__(Date a,Date b){
  Calendar c=Calendar.getInstance();
  Calendar c2=Calendar.getInstance();
  c2.setTime(b);
  c.set(Calendar.MILLISECOND,0);
  c.set(Calendar.SECOND,0);
  c.set(Calendar.MINUTE,0);
  c.set(Calendar.HOUR,0);
  c2.set(Calendar.MILLISECOND,0);
  c2.set(Calendar.SECOND,0);
  c2.set(Calendar.MINUTE,0);
  c2.set(Calendar.HOUR,0);
  if (c2.get(Calendar.YEAR) == c.get(Calendar.YEAR)) {
    if (c2.get(Calendar.MONTH) == c.get(Calendar.MONTH)) {
      if (c2.get(Calendar.DAY_OF_MONTH) == c.get(Calendar.DAY_OF_MONTH)) {
        return true;
      }
    }
  }
  return false;
}

}