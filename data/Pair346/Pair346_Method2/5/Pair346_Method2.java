import java.util.*;

public class Target {

boolean isSameDay(Date a,Date b){
  Calendar cal_a=Calendar.getInstance();
  Calendar cal_b=Calendar.getInstance();
  cal_a.setTime(a);
  cal_b.setTime(b);
  if (cal_a.get(Calendar.DATE) == cal_b.get(Calendar.DATE) && cal_a.get(Calendar.MONTH) == cal_b.get(Calendar.MONTH) && cal_a.get(Calendar.YEAR) == cal_b.get(Calendar.YEAR)) {
    return true;
  }
  return false;
}
  boolean __target__(Date a,Date b){
  Calendar cal_a=Calendar.getInstance();
  Calendar cal_b=Calendar.getInstance();
  cal_a.setTime(a);
  if (cal_a.get(Calendar.DATE) == cal_b.get(Calendar.DATE) && cal_a.get(Calendar.MONTH) == cal_b.get(Calendar.MONTH) && cal_a.get(Calendar.YEAR) == cal_b.get(Calendar.YEAR)) {
    return true;
  }
  return false;
}

}