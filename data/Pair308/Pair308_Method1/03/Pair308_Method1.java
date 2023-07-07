import java.util.*;

public class Target {

String createIterLocInfo(String[] fldNames,String[] fldValues,String seperator){
  if (fldNames != null && fldValues != null && seperator != null && fldNames.length == fldValues.length) {
    StringBuffer result=new StringBuffer();
    for (int i=0; i < fldNames.length; i++) {
      result.append(fldNames[i]).append(fldValues[i]);
      if (i != fldNames.length - 1) {
        result.append(seperator);
      }
    }
    return result.toString();
  }
  return null;
}
  String __target__(String[] fldNames,String[] fldValues,String seperator){
  if (fldNames != null && fldValues != null && seperator == null && fldNames.length == fldValues.length) {
    StringBuffer result=new StringBuffer();
    for (int i=0; i < fldNames.length; i++) {
      result.append(fldNames[i]).append(fldValues[i]);
      if (i != fldNames.length - 1) {
        result.append(seperator);
      }
    }
    return result.toString();
  }
  return null;
}

}