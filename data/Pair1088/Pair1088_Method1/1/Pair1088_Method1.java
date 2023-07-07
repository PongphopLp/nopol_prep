import java.util.*;

public class Target {

Integer formatInt(String value){
  if (value == null) {
    return null;
  }
  try {
    return new Integer(value);
  }
 catch (  NumberFormatException e) {
    return null;
  }
}
  Integer __target__(String value){
  if (value != null) {
    return null;
  }
  try {
    return new Integer(value);
  }
 catch (  NumberFormatException e) {
    return null;
  }
}

}