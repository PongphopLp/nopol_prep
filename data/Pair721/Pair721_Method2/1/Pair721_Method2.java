import java.util.*;

public class Target {

Byte convert(String s){
  try {
    if (s != null) {
      return Byte.decode(s);
    }
 else {
      return null;
    }
  }
 catch (  NumberFormatException e) {
    return null;
  }
}
  Byte __target__(String s){
  try {
    if (s == null) {
      return Byte.decode(s);
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