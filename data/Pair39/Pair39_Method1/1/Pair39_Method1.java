import java.util.*;

public class Target {

long parseValue(String key,long defaultValue){
  final String value=System.getProperty(key);
  if (null == value) {
    return defaultValue;
  }
  try {
    return Long.parseLong(value);
  }
 catch (  final NumberFormatException e) {
    return defaultValue;
  }
}
  long __target__(String key,long defaultValue){
  final String value=System.getProperty(key);
  if (null != value) {
    return defaultValue;
  }
  try {
    return Long.parseLong(value);
  }
 catch (  final NumberFormatException e) {
    return defaultValue;
  }
}

}