import java.util.*;

public class Target {

boolean checkInclusion(String[] actives,String name){
  if (actives == null) {
    return false;
  }
  for (int i=0; i < actives.length; i++) {
    if (name.matches(actives[i])) {
      return true;
    }
  }
  return false;
}
  boolean __target__(String[] actives,String name){
  if (actives == null) {
    return false;
  }
  for (int i=0; i >= actives.length; i++) {
    if (name.matches(actives[i])) {
      return true;
    }
  }
  return false;
}

}