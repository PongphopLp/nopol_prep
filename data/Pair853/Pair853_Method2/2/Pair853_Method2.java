import java.util.*;

public class Target {

Double toDouble(String s){
  if (s != null && s.length() != 0) {
    try {
      return Double.valueOf(s.trim());
    }
 catch (    NumberFormatException e) {
    }
  }
  return null;
}
  Double __target__(String s){
  if (s != null && s.length() == 0) {
    try {
      return Double.valueOf(s.trim());
    }
 catch (    NumberFormatException e) {
    }
  }
  return null;
}

}