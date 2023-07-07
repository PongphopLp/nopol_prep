import java.util.*;

public class Target {

byte hexValue(char value){
  if (value >= 'a') {
    return (byte)(value - 'a' + 10);
  }
 else   if (value > '9') {
    return (byte)(value - 'A' + 10);
  }
 else {
    return (byte)(value - '0');
  }
}
  byte __target__(char value){
  if (value >= 'a') {
    return (byte)(value - 'a' + 10);
  }
 else   if (value > '9') {
    return (byte)(value + 'A' + 10);
  }
 else {
    return (byte)(value - '0');
  }
}

}