import java.util.*;

public class Target {

long parseLong(String s,long def){
  if (s == null || s.equals("")) {
    return def;
  }
  try {
    return Long.valueOf(s);
  }
 catch (  NumberFormatException e) {
    return def;
  }
}
  long __target__(String s,long def){
  if (s != null || s.equals("")) {
    return def;
  }
  try {
    return Long.valueOf(s);
  }
 catch (  NumberFormatException e) {
    return def;
  }
}

}