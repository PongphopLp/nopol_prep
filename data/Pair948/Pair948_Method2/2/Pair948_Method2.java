import java.util.*;

public class Target {

int compare(Date date,Date compareWithDate){
  if ((date != null) && (compareWithDate == null)) {
    return -1;
  }
 else   if ((date == null) && (compareWithDate != null)) {
    return 1;
  }
 else   if (date == compareWithDate) {
    return 0;
  }
 else {
    return -date.compareTo(compareWithDate);
  }
}
  int __target__(Date date,Date compareWithDate){
  if ((date != null) && (compareWithDate != null)) {
    return -1;
  }
 else   if ((date == null) && (compareWithDate != null)) {
    return 1;
  }
 else   if (date == compareWithDate) {
    return 0;
  }
 else {
    return -date.compareTo(compareWithDate);
  }
}

}