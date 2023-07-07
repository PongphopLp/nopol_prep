import java.util.*;

public class Target {

int compare(Object v1,Object v2){
  String s1=(String)v1;
  String s2=(String)v2;
  int stringCompareValue=s1.compareTo(s2);
  if (stringCompareValue == 0) {
    return 0;
  }
  int dotsCompareValue=s1.length() - s2.length();
  if (dotsCompareValue == 0) {
    return stringCompareValue;
  }
 else   if (dotsCompareValue > 0) {
    return 1;
  }
  return -1;
}
  int __target__(Object v1,Object v2){
  String s1=(String)v1;
  String s2=(String)v2;
  int stringCompareValue=s1.compareTo(s2);
  if (stringCompareValue == 0) {
    return 0;
  }
  int dotsCompareValue=s1.length() - s2.length();
  if (dotsCompareValue == 0) {
    return stringCompareValue;
  }
 else   if (dotsCompareValue >= 0) {
    return 1;
  }
  return -1;
}

}