import java.util.*;

public class Target {

String getParam(String source,String key,String defaultValue){
  if (source == null || key == null) {
    return defaultValue;
  }
  int i=source.indexOf(key + "=");
  if (i < 0) {
    return defaultValue;
  }
  int j=i + key.length() + 1;
  int k=source.indexOf("::",j);
  if (k < 0) {
    k=source.length();
  }
  try {
    return source.substring(j,k);
  }
 catch (  Exception _ex) {
    return defaultValue;
  }
}
  String __target__(String source,String key,String defaultValue){
  if (source == null || key == null) {
    return defaultValue;
  }
  int i=source.indexOf(key + "=");
  if (i < 0) {
    return defaultValue;
  }
  int j=i + key.length() + 1;
  int k=source.indexOf("::",j);
  if (k >= 0) {
    k=source.length();
  }
  try {
    return source.substring(j,k);
  }
 catch (  Exception _ex) {
    return defaultValue;
  }
}

}