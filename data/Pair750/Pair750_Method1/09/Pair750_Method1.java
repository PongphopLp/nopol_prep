import java.util.*;

public class Target {

boolean assertRange(String value,int minValue,int maxValue,boolean includeMinimum,boolean includeMaximum,String name,ArrayList errList){
  int val=Integer.parseInt(value);
  boolean isOK=true;
  if (includeMinimum) {
    isOK=minValue <= val;
  }
 else {
    isOK=minValue < val;
  }
  if (isOK) {
    if (includeMaximum) {
      isOK=maxValue >= val;
    }
 else {
      isOK=maxValue > val;
    }
    if (isOK)     return true;
  }
  String errMsg=name + " is out of the interval ";
  if (includeMinimum) {
    errMsg+="[";
  }
 else {
    errMsg+="]";
  }
  errMsg+=minValue + ";" + maxValue;
  if (includeMaximum) {
    errMsg+="]";
  }
 else {
    errMsg+="[";
  }
  errList.add(errMsg);
  return false;
}
  boolean __target__(String value,int minValue,int maxValue,boolean includeMinimum,boolean includeMaximum,String name,ArrayList errList){
  int val=Integer.parseInt(value);
  boolean isOK=true;
  if (includeMinimum) {
    isOK=minValue <= val;
  }
 else {
    isOK=minValue >= val;
  }
  if (isOK) {
    if (includeMaximum) {
      isOK=maxValue >= val;
    }
 else {
      isOK=maxValue > val;
    }
    if (isOK)     return true;
  }
  String errMsg=name + " is out of the interval ";
  if (includeMinimum) {
    errMsg+="[";
  }
 else {
    errMsg+="]";
  }
  errMsg+=minValue + ";" + maxValue;
  if (includeMaximum) {
    errMsg+="]";
  }
 else {
    errMsg+="[";
  }
  errList.add(errMsg);
  return false;
}

}