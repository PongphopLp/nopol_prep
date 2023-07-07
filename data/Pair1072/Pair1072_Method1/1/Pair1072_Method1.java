import java.util.*;

public class Target {

Integer toInt(String value){
  if (value != null) {
    try {
      return Integer.parseInt(value);
    }
 catch (    NumberFormatException e) {
    }
  }
  return null;
}
  Integer __target__(String value){
  if (value == null) {
    try {
      return Integer.parseInt(value);
    }
 catch (    NumberFormatException e) {
    }
  }
  return null;
}

}