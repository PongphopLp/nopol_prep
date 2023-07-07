import java.util.*;

public class Target {

Integer parseIntegerNull(String value){
  if (value == null)   return null;
  try {
    return Integer.parseInt(value);
  }
 catch (  Exception ex) {
    return null;
  }
}
  Integer __target__(String value){
  if (value != null)   return null;
  try {
    return Integer.parseInt(value);
  }
 catch (  Exception ex) {
    return null;
  }
}

}