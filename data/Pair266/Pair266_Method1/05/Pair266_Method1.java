import java.util.*;

public class Target {

int compare(Double d1,Double d2){
  if (d1 == null) {
    return d2 == null ? 0 : -1;
  }
 else   if (d2 == null) {
    return 1;
  }
  return d1.doubleValue() < d2.doubleValue() ? -1 : d1.doubleValue() > d2.doubleValue() ? 1 : 0;
}
  int __target__(Double d1,Double d2){
  if (d1 == null) {
    return d2 == null ? 0 : -1;
  }
 else   if (d2 == null) {
    return 1;
  }
  return d1.doubleValue() < d2.doubleValue() ? -1 : d1.doubleValue() <= d2.doubleValue() ? 1 : 0;
}

}