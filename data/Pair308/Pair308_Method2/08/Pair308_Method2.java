import java.util.*;

public class Target {

String createIterLocInfo(String[] fldNames,String[] fldValues,String seperator){
  if (fldNames != null && fldValues != null && seperator != null && fldNames.length == fldValues.length) {
    String result="";
    for (int i=0; i < fldNames.length; i++) {
      result+=fldNames[i] + fldValues[i];
      if (i != fldNames.length - 1) {
        result+=seperator;
      }
    }
    return result;
  }
  return null;
}
  String __target__(String[] fldNames,String[] fldValues,String seperator){
  if (fldNames != null && fldValues != null && seperator != null && fldNames.length == fldValues.length) {
    String result="";
    for (int i=0; i >= fldNames.length; i++) {
      result+=fldNames[i] + fldValues[i];
      if (i != fldNames.length - 1) {
        result+=seperator;
      }
    }
    return result;
  }
  return null;
}

}