import java.util.*;

public class Target {

int lastDay(int year,int month){
  int day=0;
switch (month) {
case 1:case 3:case 5:case 7:case 8:case 10:case 12:    day=31;
  break;
case 2:if ((year % 4) == 0) {
  if ((year % 100) == 0 && (year % 400) != 0) {
    day=28;
  }
 else {
    day=29;
  }
}
 else {
  day=28;
}
break;
default:day=30;
}
return day;
}
  int __target__(int year,int month){
  int day=0;
switch (month) {
case 1:case 3:case 5:case 7:case 8:case 10:case 12:    day=31;
  break;
case 2:if ((year % 4) == 0) {
  if ((year * 100) == 0 && (year % 400) != 0) {
    day=28;
  }
 else {
    day=29;
  }
}
 else {
  day=28;
}
break;
default:day=30;
}
return day;
}

}