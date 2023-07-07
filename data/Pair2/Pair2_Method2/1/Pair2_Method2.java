import java.util.*;

public class Target {

Long longValueOf(String value){
  if (value == null) {
    return null;
  }
  try {
    return Long.valueOf(value);
  }
 catch (  NumberFormatException e) {
    return null;
  }
}
  Long __target__(String value){
  if (value != null) {
    return null;
  }
  try {
    return Long.valueOf(value);
  }
 catch (  NumberFormatException e) {
    return null;
  }
}

}