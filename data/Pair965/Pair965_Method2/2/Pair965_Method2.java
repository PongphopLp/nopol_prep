import java.util.*;

public class Target {

int compare(String o1,String o2){
  if (o1 == null) {
    return (o2 == null ? 0 : 1);
  }
  if (o2 == null) {
    return -1;
  }
  if (o1.length() == o2.length()) {
    return 0;
  }
  if (o1.length() < o2.length()) {
    return 1;
  }
  return -1;
}
  int __target__(String o1,String o2){
  if (o1 != null) {
    return (o2 == null ? 0 : 1);
  }
  if (o2 == null) {
    return -1;
  }
  if (o1.length() == o2.length()) {
    return 0;
  }
  if (o1.length() < o2.length()) {
    return 1;
  }
  return -1;
}

}