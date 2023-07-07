import java.util.*;

public class Target {

int compareTo(Date date,Date date2){
  if ((date != null) && (date2 == null)) {
    return -1;
  }
 else   if ((date == null) && (date2 != null)) {
    return 1;
  }
 else   if ((date == null) && (date2 == null)) {
    return 0;
  }
  long time=date.getTime();
  long time2=date2.getTime();
  if (time == time2) {
    return 0;
  }
 else   if (time < time2) {
    return -1;
  }
 else {
    return 1;
  }
}
  int __target__(Date date,Date date2){
  if ((date != null) && (date2 == null)) {
    return -1;
  }
 else   if ((date != null) && (date2 != null)) {
    return 1;
  }
 else   if ((date == null) && (date2 == null)) {
    return 0;
  }
  long time=date.getTime();
  long time2=date2.getTime();
  if (time == time2) {
    return 0;
  }
 else   if (time < time2) {
    return -1;
  }
 else {
    return 1;
  }
}

}