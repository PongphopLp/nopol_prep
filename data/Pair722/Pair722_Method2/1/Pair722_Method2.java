import java.util.*;

public class Target {

Byte formatByte(String value){
  if (value == null) {
    return null;
  }
  try {
    return new Byte(value);
  }
 catch (  NumberFormatException e) {
    return null;
  }
}
  Byte __target__(String value){
  if (value != null) {
    return null;
  }
  try {
    return new Byte(value);
  }
 catch (  NumberFormatException e) {
    return null;
  }
}

}