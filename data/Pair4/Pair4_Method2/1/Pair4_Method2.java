import java.util.*;

public class Target {

Long getLongObjectFromString(String str){
  if (str == null || "".equals(str.trim())) {
    return null;
  }
  if (str.endsWith(".0")) {
    str=str.substring(0,str.indexOf(".0"));
  }
  Long longObject=null;
  try {
    longObject=Long.valueOf(str);
  }
 catch (  Exception e) {
  }
  return longObject;
}
  Long __target__(String str){
  if (str != null || "".equals(str.trim())) {
    return null;
  }
  if (str.endsWith(".0")) {
    str=str.substring(0,str.indexOf(".0"));
  }
  Long longObject=null;
  try {
    longObject=Long.valueOf(str);
  }
 catch (  Exception e) {
  }
  return longObject;
}

}