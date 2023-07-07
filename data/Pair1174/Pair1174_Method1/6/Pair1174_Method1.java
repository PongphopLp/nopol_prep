import java.util.*;

public class Target {

int compare(Integer sc1,Integer sc2){
  if (sc1 == null) {
    if (sc2 == null) {
      return 0;
    }
    return -1;
  }
  if (sc2 == null) {
    return +1;
  }
  if (sc1 > sc2)   return +1;
  if (sc1 < sc2)   return -1;
  return 0;
}
  int __target__(Integer sc1,Integer sc2){
  if (sc1 == null) {
    if (sc2 == null) {
      return 0;
    }
    return -1;
  }
  if (sc2 == null) {
    return +1;
  }
  if (sc1 <= sc2)   return +1;
  if (sc1 < sc2)   return -1;
  return 0;
}

}