import java.util.*;

public class Target {

int getDaysInMonth(int year,int month){
switch (month) {
case 1:    return (((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0) ? 29 : 28;
case 3:case 5:case 8:case 10:  return 30;
default:return 31;
}
}
  int __target__(int year,int month){
switch (month) {
case 1:    return (((year % 4) == 0 && (year % 100) == 0) || (year % 400) == 0) ? 29 : 28;
case 3:case 5:case 8:case 10:  return 30;
default:return 31;
}
}

}