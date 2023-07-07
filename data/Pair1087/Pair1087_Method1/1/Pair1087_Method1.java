import java.util.*;

public class Target {

Integer toInteger(String str){
  if (str == null || str.equals("")) {
    return null;
  }
  try {
    return Integer.valueOf(str);
  }
 catch (  NumberFormatException e) {
  }
  return null;
}
  Integer __target__(String str){
  if (str != null || str.equals("")) {
    return null;
  }
  try {
    return Integer.valueOf(str);
  }
 catch (  NumberFormatException e) {
  }
  return null;
}

}