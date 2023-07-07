import java.util.*;

public class Target {

Boolean parseBoolean(String value){
  if (value == null) {
    return null;
  }
 else   if (value.equalsIgnoreCase("true") || value.equalsIgnoreCase("yes")) {
    return true;
  }
 else   if (value.equalsIgnoreCase("false") || value.equalsIgnoreCase("no")) {
    return false;
  }
  return null;
}
  Boolean __target__(String value){
  if (value != null) {
    return null;
  }
 else   if (value.equalsIgnoreCase("true") || value.equalsIgnoreCase("yes")) {
    return true;
  }
 else   if (value.equalsIgnoreCase("false") || value.equalsIgnoreCase("no")) {
    return false;
  }
  return null;
}

}