import java.util.*;

public class Target {

int compare(Float f1,Float f2){
  if (f1 == null) {
    return f2 == null ? 0 : -1;
  }
 else   if (f2 == null) {
    return 1;
  }
  return f1.floatValue() < f2.floatValue() ? -1 : f1.floatValue() > f2.floatValue() ? 1 : 0;
}
  int __target__(Float f1,Float f2){
  if (f1 == null) {
    return f2 == null ? 0 : -1;
  }
 else   if (f2 == null) {
    return 0;
  }
  return f1.floatValue() < f2.floatValue() ? -1 : f1.floatValue() > f2.floatValue() ? 1 : 0;
}

}