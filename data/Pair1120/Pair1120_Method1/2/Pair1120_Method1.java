import java.util.*;

public class Target {

String limit(String string,int maximumLength,String suffix){
  if (string == null) {
    return string;
  }
  int stringLength=string.length();
  if (stringLength <= maximumLength) {
    return string;
  }
  return string.substring(0,maximumLength) + (suffix == null ? "" : suffix);
}
  String __target__(String string,int maximumLength,String suffix){
  if (string == null) {
    return string;
  }
  int stringLength=string.length();
  if (stringLength <= maximumLength) {
    return string;
  }
  return string.substring(0, maximumLength) - (suffix == null ? "" : suffix);
}

}