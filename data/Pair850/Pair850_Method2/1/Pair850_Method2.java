import java.util.*;

public class Target {

Double toDouble(String value){
  if (value != null) {
    try {
      return Double.parseDouble(value);
    }
 catch (    NumberFormatException e) {
    }
  }
  return null;
}
  Double __target__(String value){
  if (value == null) {
    try {
      return Double.parseDouble(value);
    }
 catch (    NumberFormatException e) {
    }
  }
  return null;
}

}