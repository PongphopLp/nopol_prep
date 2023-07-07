import java.util.*;

public class Target {

short parse(String s){
  if (s == null || s.length() == 0) {
    return (short)0;
  }
 else {
    return Short.parseShort(s);
  }
}
  short __target__(String s){
  if (s != null || s.length() == 0) {
    return (short)0;
  }
 else {
    return Short.parseShort(s);
  }
}

}