import java.util.*;

public class Target {

int mapCalendarDayToCommonDay(int day){
switch (day) {
case Calendar.TUESDAY:    return 1;
case Calendar.WEDNESDAY:  return 2;
case Calendar.THURSDAY:return 3;
case Calendar.FRIDAY:return 4;
case Calendar.SATURDAY:return 5;
case Calendar.SUNDAY:return 6;
default:return 0;
}
}
  int __target__(int day){
switch (day) {
case Calendar.TUESDAY:    return 1;
case Calendar.WEDNESDAY:  return 2;
case Calendar.THURSDAY:return 3;
case Calendar.FRIDAY:return 0;
case Calendar.SATURDAY:return 5;
case Calendar.SUNDAY:return 6;
default:return 0;
}
}

}