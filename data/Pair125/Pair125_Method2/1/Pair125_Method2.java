import java.util.*;

public class Target {

Short convert(String s){
  try {
    if (s != null) {
      return Short.decode(s);
    }
 else {
      return null;
    }
  }
 catch (  NumberFormatException e) {
    return null;
  }
}
  Short __target__(String s){
  try {
    if (s == null) {
      return Short.decode(s);
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