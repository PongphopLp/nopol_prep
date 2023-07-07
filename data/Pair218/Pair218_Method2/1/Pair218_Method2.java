import java.util.*;

public class Target {

Float getFloat(String value){
  if (value == null)   return null;
  try {
    return Float.parseFloat(value);
  }
 catch (  NumberFormatException nfe) {
    return null;
  }
}
  Float __target__(String value){
  if (value != null)   return null;
  try {
    return Float.parseFloat(value);
  }
 catch (  NumberFormatException nfe) {
    return null;
  }
}

}