import java.util.*;

public class Target {

int hexToInt(byte val){
  if ((val >= 'a') && (val <= 'f')) {
    return val - 'a' + 10;
  }
 else   if ((val >= 'A') && (val <= 'F')) {
    return val - 'A' + 10;
  }
 else   if ((val >= '0') && (val <= '9')) {
    return val - '0';
  }
 else {
    return -1;
  }
}
  int __target__(byte val){
  if ((val >= 'a') && (val <= 'f')) {
    return val - 'a' + 10;
  }
 else   if ((val < 'A') && (val <= 'F')) {
    return val - 'A' + 10;
  }
 else   if ((val >= '0') && (val <= '9')) {
    return val - '0';
  }
 else {
    return -1;
  }
}

}