import java.util.*;

public class Target {

int compare(Integer o1,Integer o2){
  if (o1 == null) {
    return o2 == null ? 0 : 1;
  }
  if (o2 == null) {
    return -1;
  }
  if (o1.intValue() < o2.intValue()) {
    return -1;
  }
 else   if (o1.intValue() > o2.intValue()) {
    return 1;
  }
  return 0;
}
  int __target__(Integer o1,Integer o2){
  if (o1 == null) {
    return o2 == null ? 0 : 1;
  }
  if (o2 == null) {
    return -1;
  }
  if (o1.intValue() >= o2.intValue()) {
    return -1;
  }
 else   if (o1.intValue() > o2.intValue()) {
    return 1;
  }
  return 0;
}

}