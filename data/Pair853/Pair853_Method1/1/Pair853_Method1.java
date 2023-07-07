import java.util.*;

public class Target {

Double getDoubleObjectFromString(String str){
  if (str == null || "".equals(str.trim())) {
    return null;
  }
  Double doubleObject=null;
  try {
    doubleObject=Double.valueOf(str);
  }
 catch (  Exception e) {
  }
  return doubleObject;
}
  Double __target__(String str){
  if (str != null || "".equals(str.trim())) {
    return null;
  }
  Double doubleObject=null;
  try {
    doubleObject=Double.valueOf(str);
  }
 catch (  Exception e) {
  }
  return doubleObject;
}

}