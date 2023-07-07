import java.util.*;

public class Target {

Byte toByte(String value){
  if (value != null) {
    try {
      return Byte.parseByte(value);
    }
 catch (    NumberFormatException e) {
    }
  }
  return null;
}
  Byte __target__(String value){
  if (value == null) {
    try {
      return Byte.parseByte(value);
    }
 catch (    NumberFormatException e) {
    }
  }
  return null;
}

}