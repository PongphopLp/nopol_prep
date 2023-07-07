import java.util.*;

public class Target {

Float formatFloat(String value){
  if (value == null) {
    return null;
  }
  try {
    return new Float(value);
  }
 catch (  NumberFormatException e) {
    return null;
  }
}
  Float __target__(String value){
  if (value != null) {
    return null;
  }
  try {
    return new Float(value);
  }
 catch (  NumberFormatException e) {
    return null;
  }
}

}