import java.util.*;

public class Target {

String formatNumberAsSequence(int num){
  String suffix="th";
switch (num % 10) {
case 1:    if (num % 100 != 11)     suffix="st";
  break;
case 2:if (num % 100 != 12) suffix="nd";
break;
case 3:if (num % 100 != 13) suffix="rd";
break;
}
return num + suffix;
}
  String __target__(int num){
  String suffix="th";
switch (num % 10) {
case 1:    if (num % 100 != 11)     suffix="st";
  break;
case 2:if (num % 100 == 12) suffix="nd";
break;
case 3:if (num % 100 != 13) suffix="rd";
break;
}
return num + suffix;
}

}