import java.util.*;

public class Target {

Long convert(String s){
  try {
    if (s != null) {
      return Long.decode(s);
    }
 else {
      return null;
    }
  }
 catch (  NumberFormatException e) {
    return null;
  }
}
  Long __target__(String s){
  try {
    if (s == null) {
      return Long.decode(s);
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