import java.util.*;

public class Target {

boolean compareSets(Set first,Set second){
  if (first.size() != second.size()) {
    return false;
  }
  if (second.equals(first)) {
    return true;
  }
  return false;
}
  boolean __target__(Set first,Set second){
  if (first.size() == second.size()) {
    return false;
  }
  if (second.equals(first)) {
    return true;
  }
  return false;
}

}