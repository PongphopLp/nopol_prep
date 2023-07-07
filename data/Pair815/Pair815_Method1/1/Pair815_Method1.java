import java.util.*;

public class Target {

boolean equalsEmptyNull(String string1,String string2){
  if (string1 == null) {
    return string2 == null || string2.length() == 0;
  }
  if (string2 == null) {
    return string1.length() == 0;
  }
  return string1.equals(string2);
}
  boolean __target__(String string1,String string2){
  if (string1 != null) {
    return string2 == null || string2.length() == 0;
  }
  if (string2 == null) {
    return string1.length() == 0;
  }
  return string1.equals(string2);
}

}