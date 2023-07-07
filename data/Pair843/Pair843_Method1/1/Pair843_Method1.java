import java.util.*;

public class Target {

Double convert(String s){
  try {
    if (s != null) {
      return Double.parseDouble(s);
    }
 else {
      return null;
    }
  }
 catch (  NumberFormatException e) {
    return null;
  }
}
  Double __target__(String s){
  try {
    if (s == null) {
      return Double.parseDouble(s);
    }
 else {
      return null;
    }
  }
 catch (  NumberFormatException e) {
    return null;
  }
}

}