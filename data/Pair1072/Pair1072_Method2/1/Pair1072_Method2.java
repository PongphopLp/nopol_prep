import java.util.*;

public class Target {

Integer convert(String s){
  try {
    if (s != null) {
      return Integer.decode(s);
    }
 else {
      return null;
    }
  }
 catch (  NumberFormatException e) {
    return null;
  }
}
  Integer __target__(String s){
  try {
    if (s == null) {
      return Integer.decode(s);
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