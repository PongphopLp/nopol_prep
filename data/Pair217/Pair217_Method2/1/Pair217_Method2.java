import java.util.*;

public class Target {

Float convert(String s){
  try {
    if (s != null) {
      return Float.parseFloat(s);
    }
 else {
      return null;
    }
  }
 catch (  NumberFormatException e) {
    return null;
  }
}
  Float __target__(String s){
  try {
    if (s == null) {
      return Float.parseFloat(s);
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