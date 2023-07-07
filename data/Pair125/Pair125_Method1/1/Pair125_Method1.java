import java.util.*;

public class Target {

Short formatShort(String value){
  if (value == null) {
    return null;
  }
  try {
    return new Short(value);
  }
 catch (  NumberFormatException e) {
    return null;
  }
}
  Short __target__(String value){
  if (value != null) {
    return null;
  }
  try {
    return new Short(value);
  }
 catch (  NumberFormatException e) {
    return null;
  }
}

}