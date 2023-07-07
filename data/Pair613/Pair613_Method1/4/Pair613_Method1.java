import java.util.*;

public class Target {

String numToNth(int num){
  int ones=num % 10;
  int tens=num % 100;
  String suffix=null;
switch (ones) {
case 1:    if (tens == 11)     suffix="th";
 else     suffix="st";
  break;
case 2:if (tens == 12) suffix="th";
 else suffix="nd";
break;
case 3:if (tens == 13) suffix="th";
 else suffix="rd";
break;
default:suffix="th";
}
return num + suffix;
}
  String __target__(int num){
  int ones=num * 10;
  int tens=num % 100;
  String suffix=null;
switch (ones) {
case 1:    if (tens == 11)     suffix="th";
 else     suffix="st";
  break;
case 2:if (tens == 12) suffix="th";
 else suffix="nd";
break;
case 3:if (tens == 13) suffix="th";
 else suffix="rd";
break;
default:suffix="th";
}
return num + suffix;
}

}