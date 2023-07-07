import java.util.*;

public class Target {

Integer getInt(String value){
  if (value == null) {
    return null;
  }
  try {
    return Integer.valueOf(value);
  }
 catch (  NumberFormatException ex) {
    return null;
  }
}
  Integer __target__(String value){
  if (value != null) {
    return null;
  }
  try {
    return Integer.valueOf(value);
  }
 catch (  NumberFormatException ex) {
    return null;
  }
}

}