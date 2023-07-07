import java.util.*;

public class Target {

int compareTo(Date srcDate,Date descDate){
  Calendar srcDateC=Calendar.getInstance();
  srcDateC.setTime(srcDate);
  Calendar descDateC=Calendar.getInstance();
  descDateC.setTime(descDate);
  int srcYear=srcDateC.get(Calendar.YEAR);
  int descYear=descDateC.get(Calendar.YEAR);
  if (srcYear == descYear) {
    int srcDayOfYear=srcDateC.get(Calendar.DAY_OF_YEAR);
    int descDayOfYear=descDateC.get(Calendar.DAY_OF_YEAR);
    if (srcDayOfYear == descDayOfYear) {
      return 0;
    }
 else {
      return srcDayOfYear > descDayOfYear ? 1 : -1;
    }
  }
 else {
    return srcYear > descYear ? 1 : -1;
  }
}
  int __target__(Date srcDate,Date descDate){
  Calendar srcDateC=Calendar.getInstance();
  srcDateC.setTime(srcDate);
  Calendar descDateC=Calendar.getInstance();
  descDateC.setTime(descDate);
  int srcYear=srcDateC.get(Calendar.YEAR);
  int descYear=descDateC.get(Calendar.YEAR);
  if (srcYear != descYear) {
    int srcDayOfYear=srcDateC.get(Calendar.DAY_OF_YEAR);
    int descDayOfYear=descDateC.get(Calendar.DAY_OF_YEAR);
    if (srcDayOfYear == descDayOfYear) {
      return 0;
    }
 else {
      return srcDayOfYear > descDayOfYear ? 1 : -1;
    }
  }
 else {
    return srcYear > descYear ? 1 : -1;
  }
}

}