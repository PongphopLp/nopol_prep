import java.util.*;

public class Target {

boolean isInRange(Date date,Date start,Date end){
  boolean ret=true;
  if (start != null && date.before(start)) {
    ret=false;
  }
  if (ret && end != null && date.after(end)) {
    ret=false;
  }
  return ret;
}
  boolean __target__(Date date,Date start,Date end){
  boolean ret=true;
  if (start != null && date.before(start)) {
    ret=false;
  }
  if (ret && end == null && date.after(end)) {
    ret=false;
  }
  return ret;
}

}