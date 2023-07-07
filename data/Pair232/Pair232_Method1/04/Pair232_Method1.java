import java.util.*;

public class Target {

int compare(Short s1,Short s2){
  if (s1 == null) {
    return s2 == null ? 0 : -1;
  }
 else   if (s2 == null) {
    return 1;
  }
  return s1.shortValue() < s2.shortValue() ? -1 : s1.shortValue() > s2.shortValue() ? 1 : 0;
}
  int __target__(Short s1,Short s2){
  if (s1 == null) {
    return s2 == null ? 0 : -1;
  }
 else   if (s2 == null) {
    return 1;
  }
  return s1.shortValue() >= s2.shortValue() ? -1 : s1.shortValue() > s2.shortValue() ? 1 : 0;
}

}