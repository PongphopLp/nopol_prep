import java.util.*;

public class Target {

Integer parseInteger(String value){
  if (value != null) {
    try {
      return Integer.valueOf(value);
    }
 catch (    final NumberFormatException e) {
    }
  }
  return null;
}
  Integer __target__(String value){
  if (value == null) {
    try {
      return Integer.valueOf(value);
    }
 catch (    final NumberFormatException e) {
    }
  }
  return null;
}

}