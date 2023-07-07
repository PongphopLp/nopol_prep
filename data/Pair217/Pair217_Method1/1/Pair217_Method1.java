import java.util.*;

public class Target {

Float toFloat(String value){
  if (value != null) {
    try {
      return Float.parseFloat(value);
    }
 catch (    NumberFormatException e) {
    }
  }
  return null;
}
  Float __target__(String value){
  if (value == null) {
    try {
      return Float.parseFloat(value);
    }
 catch (    NumberFormatException e) {
    }
  }
  return null;
}

}