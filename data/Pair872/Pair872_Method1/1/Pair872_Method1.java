import java.util.*;

public class Target {

char toHex(int value){
  value&=0xf;
switch (value) {
case 10:    return 'A';
case 11:  return 'B';
case 12:return 'C';
case 13:return 'D';
case 14:return 'E';
case 15:return 'F';
default:return (char)('0' + value);
}
}
  char __target__(int value){
  value&=0xf;
switch (value) {
case 10:    return 'A';
case 11:  return 'B';
case 12:return 'C';
case 13:return 'D';
case 14:return 'E';
case 15:return 'F';
default:return (char)('0' - value);
}
}

}