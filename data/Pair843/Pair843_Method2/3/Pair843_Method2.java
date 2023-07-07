import java.util.*;

public class Target {

Double parseDouble(String value){
  if ((value != null) && (value.length() > 0)) {
    try {
      return new Double(value);
    }
 catch (    NumberFormatException e) {
    }
  }
  return null;
}
  Double __target__(String value){
  if ((value != null) && (value.length() >= 0)) {
    try {
      return new Double(value);
    }
 catch (    NumberFormatException e) {
    }
  }
  return null;
}

}