import java.util.*;

public class Target {

long parseLongIfExists(String value){
  if (value == null || value.length() == 0) {
    return 0;
  }
  return Long.parseLong(value);
}
  long __target__(String value){
  if (value != null || value.length() == 0) {
    return 0;
  }
  return Long.parseLong(value);
}

}