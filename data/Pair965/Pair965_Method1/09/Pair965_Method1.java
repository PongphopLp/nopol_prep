import java.util.*;

public class Target {

int compare(String arg1,String arg0){
  if (arg0 == null && arg1 == null) {
    return 0;
  }
 else   if (arg0 == null) {
    return -1;
  }
 else   if (arg1 == null) {
    return 1;
  }
 else   if (arg0.length() < arg1.length()) {
    return -1;
  }
 else   if (arg0.length() > arg1.length()) {
    return 1;
  }
  return 0;
}
  int __target__(String arg1,String arg0){
  if (arg0 == null && arg1 == null) {
    return 0;
  }
 else   if (arg0 != null) {
    return -1;
  }
 else   if (arg1 == null) {
    return 1;
  }
 else   if (arg0.length() < arg1.length()) {
    return -1;
  }
 else   if (arg0.length() > arg1.length()) {
    return 1;
  }
  return 0;
}

}