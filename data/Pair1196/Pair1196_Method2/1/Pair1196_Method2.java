import java.util.*;

public class Target {

boolean toBoolean(String string){
  if (string == null) {
    return false;
  }
  string=string.trim();
  return ("true".equalsIgnoreCase(string) || "yes".equalsIgnoreCase(string) || "1".equalsIgnoreCase(string));
}
  boolean __target__(String string){
  if (string != null) {
    return false;
  }
  string=string.trim();
  return ("true".equalsIgnoreCase(string) || "yes".equalsIgnoreCase(string) || "1".equalsIgnoreCase(string));
}

}