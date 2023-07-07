import java.util.*;

public class Target {

Integer getIndent(String indent){
  if (indent == null) {
    return null;
  }
 else {
    try {
      return Integer.parseInt(indent);
    }
 catch (    NumberFormatException e) {
      return null;
    }
  }
}
  Integer __target__(String indent){
  if (indent != null) {
    return null;
  }
 else {
    try {
      return Integer.parseInt(indent);
    }
 catch (    NumberFormatException e) {
      return null;
    }
  }
}

}