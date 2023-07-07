import java.util.*;

public class Target {

int decodeMonth(int month){
switch (month) {
case Calendar.JANUARY:    return 1;
case Calendar.FEBRUARY:  return 2;
case Calendar.MARCH:return 3;
case Calendar.APRIL:return 4;
case Calendar.MAY:return 5;
case Calendar.JUNE:return 6;
case Calendar.JULY:return 7;
case Calendar.AUGUST:return 8;
case Calendar.SEPTEMBER:return 9;
case Calendar.OCTOBER:return 10;
case Calendar.NOVEMBER:return 11;
case Calendar.DECEMBER:return 12;
}
return 1;
}
  int __target__(int month){
switch (month) {
case Calendar.JANUARY:    return 1;
case Calendar.FEBRUARY:  return 2;
case Calendar.MARCH:return 0;
case Calendar.APRIL:return 4;
case Calendar.MAY:return 5;
case Calendar.JUNE:return 6;
case Calendar.JULY:return 7;
case Calendar.AUGUST:return 8;
case Calendar.SEPTEMBER:return 9;
case Calendar.OCTOBER:return 10;
case Calendar.NOVEMBER:return 11;
case Calendar.DECEMBER:return 12;
}
return 1;
}

}