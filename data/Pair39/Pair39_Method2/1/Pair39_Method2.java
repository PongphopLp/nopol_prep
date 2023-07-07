import java.util.*;

public class Target {

long getLongProperty(String name,long defaultValue){
  String val=System.getProperty(name);
  if (val != null) {
    try {
      return Long.parseLong(val);
    }
 catch (    NumberFormatException e) {
      return defaultValue;
    }
  }
 else {
    return defaultValue;
  }
}
  long __target__(String name,long defaultValue){
  String val=System.getProperty(name);
  if (val == null) {
    try {
      return Long.parseLong(val);
    }
 catch (    NumberFormatException e) {
      return defaultValue;
    }
  }
 else {
    return defaultValue;
  }
}

}