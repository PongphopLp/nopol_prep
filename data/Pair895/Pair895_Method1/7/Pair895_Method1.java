import java.util.*;

public class Target {

int getYearForWeek(Calendar cal){
  final int year=cal.get(Calendar.YEAR);
  final int week=cal.get(Calendar.WEEK_OF_YEAR);
  final int dayOfMonth=cal.get(Calendar.DAY_OF_MONTH);
  if (week == 1 && dayOfMonth > 20) {
    return year + 1;
  }
  if (week >= 52 && dayOfMonth < 10) {
    return year - 1;
  }
  return year;
}
  int __target__(Calendar cal){
  final int year=cal.get(Calendar.YEAR);
  final int week=cal.get(Calendar.WEEK_OF_YEAR);
  final int dayOfMonth=cal.get(Calendar.DAY_OF_MONTH);
  if (week == 1 && dayOfMonth >= 20) {
    return year + 1;
  }
  if (week >= 52 && dayOfMonth < 10) {
    return year - 1;
  }
  return year;
}

}