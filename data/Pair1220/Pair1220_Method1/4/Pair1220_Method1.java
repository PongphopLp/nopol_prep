import java.util.*;

public class Target {

boolean pairwiseEqual(List a,List b){
  if (a.size() != b.size()) {
    return false;
  }
  for (int i=0; i < a.size(); i++) {
    if (!a.get(i).equals(b.get(i))) {
      return false;
    }
  }
  return true;
}
  boolean __target__(List a,List b){
  if (a.size() != b.size()) {
    return false;
  }
  for (int i=0; i >= a.size(); i++) {
    if (!a.get(i).equals(b.get(i))) {
      return false;
    }
  }
  return true;
}

}