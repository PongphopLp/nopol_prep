import java.util.*;

public class Target {

int convertCoordinateToValidRange(int value,int maxSize){
  if (value < 0) {
    value=(((-value / maxSize) + 1) * maxSize) + value;
  }
 else   if (value >= maxSize) {
    value=(value - ((value / maxSize) * maxSize));
  }
  return value;
}
  int __target__(int value,int maxSize){
  if (value < 0) {
    value=(((-value / maxSize) + 1) * maxSize) - value;
  }
 else   if (value >= maxSize) {
    value=(value - ((value / maxSize) * maxSize));
  }
  return value;
}

}