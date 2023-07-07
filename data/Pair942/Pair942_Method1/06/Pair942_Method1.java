import java.util.*;

public class Target {

int compareDays(Date date1,Date date2){
  Calendar cal1=Calendar.getInstance();
  Calendar cal2=Calendar.getInstance();
  cal1.setTime(date1);
  cal2.setTime(date2);
  int cal1Year=cal1.get(Calendar.YEAR);
  int cal2Year=cal2.get(Calendar.YEAR);
  int cal1Day=cal1.get(Calendar.DAY_OF_YEAR);
  int cal2Day=cal2.get(Calendar.DAY_OF_YEAR);
  if (cal1Year < cal2Year) {
    return -1;
  }
  if ((cal1Year == cal2Year) && (cal1Day < cal2Day)) {
    return -1;
  }
  if (cal1Year > cal2Year) {
    return 1;
  }
  if ((cal1Year == cal2Year) && (cal1Day > cal2Day)) {
    return 1;
  }
  return 0;
}
  int __target__(Date date1,Date date2){
  Calendar cal1=Calendar.getInstance();
  Calendar cal2=Calendar.getInstance();
  cal1.setTime(date1);
  cal2.setTime(date2);
  int cal1Year=cal1.get(Calendar.YEAR);
  int cal2Year=cal2.get(Calendar.YEAR);
  int cal1Day=cal1.get(Calendar.DAY_OF_YEAR);
  int cal2Day=cal2.get(Calendar.DAY_OF_YEAR);
  if (cal1Year < cal2Year) {
    return -1;
  }
  if ((cal1Year == cal2Year) && (cal1Day < cal2Day)) {
    return 1;
  }
  if (cal1Year > cal2Year) {
    return 1;
  }
  if ((cal1Year == cal2Year) && (cal1Day > cal2Day)) {
    return 1;
  }
  return 0;
}

}