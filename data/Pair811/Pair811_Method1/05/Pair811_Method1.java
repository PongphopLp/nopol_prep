import java.util.*;

public class Target {

boolean assertRange(String value,double minValue,double maxValue,boolean includeMinimum,boolean includeMaximum,String name,ArrayList errList){
  double val=Double.parseDouble(value);
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
  boolean __target__(String value,double minValue,double maxValue,boolean includeMinimum,boolean includeMaximum,String name,ArrayList errList){
  double val=Double.parseDouble(value);
  boolean isOK=true;
  if (includeMinimum) {
    isOK=minValue <= val;
  }
 else {
    isOK=minValue <= val;
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