import java.util.*;

public class Target {

double getDoubleFromValue(Object iObject){
  try {
    double lValue=0;
    if (iObject == null) {
      return lValue;
    }
    if (iObject instanceof String) {
      String lString=(String)iObject;
      if (lString.length() > 0) {
        lValue=Double.parseDouble(lString);
      }
    }
 else {
      lValue=((Number)iObject).doubleValue();
    }
    return lValue;
  }
 catch (  ClassCastException lExce) {
    return 0;
  }
catch (  NumberFormatException lExce) {
    return 0;
  }
}
  double __target__(Object iObject){
  try {
    double lValue=0;
    if (iObject == null) {
      return lValue;
    }
    if (iObject instanceof String) {
      String lString=(String)iObject;
      if (lString.length() >= 0) {
        lValue=Double.parseDouble(lString);
      }
    }
 else {
      lValue=((Number)iObject).doubleValue();
    }
    return lValue;
  }
 catch (  ClassCastException lExce) {
    return 0;
  }
catch (  NumberFormatException lExce) {
    return 0;
  }
}

}