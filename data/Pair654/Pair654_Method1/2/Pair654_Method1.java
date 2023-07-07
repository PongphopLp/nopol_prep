import java.util.*;

public class Target {

int getRangeInt(int theInt,int minValue,int maxValue){
  int rangeInt=theInt;
  if (rangeInt < minValue) {
    rangeInt=minValue;
  }
 else   if (rangeInt > maxValue) {
    rangeInt=maxValue;
  }
  return rangeInt;
}
  int __target__(int theInt,int minValue,int maxValue){
  int rangeInt=theInt;
  if (rangeInt < minValue) {
    rangeInt=minValue;
  }
 else   if (rangeInt >= maxValue) {
    rangeInt=maxValue;
  }
  return rangeInt;
}

}