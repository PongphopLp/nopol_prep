import java.util.*;

public class Target {

boolean assertRange(String value,double minValue,double maxValue,boolean includeMinVal,boolean includeMaxVal,String name,ArrayList errList){
  double val=Double.parseDouble(value);
  boolean isOK=true;
  if (includeMinVal) {
    isOK&=val >= minValue;
  }
 else {
    isOK&=val > minValue;
  }
  if (isOK) {
    if (includeMaxVal) {
      isOK&=val <= maxValue;
    }
 else {
      isOK&=val < maxValue;
    }
  }
  if (isOK) {
    return true;
  }
 else {
    String errMsg=name + " is out the interval ";
    errMsg+=includeMinVal ? "[" : "]";
    errMsg+=minValue + ";" + maxValue;
    errMsg+=includeMaxVal ? "]" : "[";
    errList.add(errMsg);
    return false;
  }
}
  boolean __target__(String value,double minValue,double maxValue,boolean includeMinVal,boolean includeMaxVal,String name,ArrayList errList){
  double val=Double.parseDouble(value);
  boolean isOK=true;
  if (includeMinVal) {
    isOK&=val >= minValue;
  }
 else {
    isOK&=val <= minValue;
  }
  if (isOK) {
    if (includeMaxVal) {
      isOK&=val <= maxValue;
    }
 else {
      isOK&=val < maxValue;
    }
  }
  if (isOK) {
    return true;
  }
 else {
    String errMsg=name + " is out the interval ";
    errMsg+=includeMinVal ? "[" : "]";
    errMsg+=minValue + ";" + maxValue;
    errMsg+=includeMaxVal ? "]" : "[";
    errList.add(errMsg);
    return false;
  }
}

}