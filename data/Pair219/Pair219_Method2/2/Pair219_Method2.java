import java.util.*;

public class Target {

Float convert(String value){
  Float floatValue;
  try {
    if (null == value || 0 == value.length()) {
      floatValue=null;
    }
 else {
      floatValue=Float.valueOf(value);
    }
  }
 catch (  NumberFormatException e) {
    return null;
  }
  return floatValue;
}
  Float __target__(String value){
  Float floatValue;
  try {
    if (null == value || 0 != value.length()) {
      floatValue=null;
    }
 else {
      floatValue=Float.valueOf(value);
    }
  }
 catch (  NumberFormatException e) {
    return null;
  }
  return floatValue;
}

}