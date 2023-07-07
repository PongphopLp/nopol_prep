import java.util.*;

public class Target {

char intToHexDigit(int intValue){
  if (intValue >= 0 && intValue <= 9) {
    return (String.valueOf(intValue)).charAt(0);
  }
switch (intValue) {
case 10:    return 'A';
case 11:  return 'B';
case 12:return 'C';
case 13:return 'D';
case 14:return 'E';
case 15:return 'F';
default:return '?';
}
}
  char __target__(int intValue){
  if (intValue > 0 && intValue <= 9) {
    return (String.valueOf(intValue)).charAt(0);
  }
switch (intValue) {
case 10:    return 'A';
case 11:  return 'B';
case 12:return 'C';
case 13:return 'D';
case 14:return 'E';
case 15:return 'F';
default:return '?';
}
}

}