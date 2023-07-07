import java.util.*;

public class Target {

Long toLong(String value){
  if (value != null) {
    try {
      return Long.parseLong(value);
    }
 catch (    NumberFormatException e) {
    }
  }
  return null;
}
  Long __target__(String value){
  if (value == null) {
    try {
      return Long.parseLong(value);
    }
 catch (    NumberFormatException e) {
    }
  }
  return null;
}

}