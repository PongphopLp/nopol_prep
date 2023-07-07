import java.util.*;

public class Target {

Double stringToDouble(String str){
  if (str == null) {
    return null;
  }
  try {
    return Double.valueOf(str);
  }
 catch (  NumberFormatException ex) {
    return null;
  }
}
  Double __target__(String str){
  if (str != null) {
    return null;
  }
  try {
    return Double.valueOf(str);
  }
 catch (  NumberFormatException ex) {
    return null;
  }
}

}