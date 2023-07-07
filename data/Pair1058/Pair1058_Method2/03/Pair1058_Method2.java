import java.util.*;

public class Target {

int compare(Long l1,Long l2){
  if (l1 == null) {
    return l2 == null ? 0 : -1;
  }
 else   if (l2 == null) {
    return 1;
  }
  return l1.longValue() < l2.longValue() ? -1 : l1.longValue() > l2.longValue() ? 1 : 0;
}
  int __target__(Long l1,Long l2){
  if (l1 == null) {
    return l2 == null ? 0 : -1;
  }
 else   if (l2 != null) {
    return 1;
  }
  return l1.longValue() < l2.longValue() ? -1 : l1.longValue() > l2.longValue() ? 1 : 0;
}

}