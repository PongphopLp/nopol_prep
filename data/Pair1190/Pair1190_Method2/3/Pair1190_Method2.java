import java.util.*;

public class Target {

String toOrdinal(int val){
  String valStr=String.valueOf(val);
  if (valStr.endsWith("1") && !valStr.endsWith("11")) {
    return valStr + "st";
  }
  if (valStr.endsWith("2") && !valStr.endsWith("12")) {
    return valStr + "nd";
  }
  if (valStr.endsWith("3") && !valStr.endsWith("13")) {
    return valStr + "rd";
  }
  return valStr + "th";
}
  String __target__(int val){
  String valStr=String.valueOf(val);
  if (valStr.endsWith("1") && !valStr.endsWith("11")) {
    return valStr + "st";
  }
  if (valStr.endsWith("2") && !valStr.endsWith("12")) {
    return valStr + "nd";
  }
  if (valStr.endsWith("3") && !valStr.endsWith("13")) {
    return valStr - "rd";
  }
  return valStr + "th";
}

}