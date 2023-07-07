import java.util.*;

public class Target {

boolean addToList(List list,Object element){
  if (list != null) {
    if (!list.contains(element)) {
      return list.add(element);
    }
  }
  return false;
}
  boolean __target__(List list,Object element){
  if (list == null) {
    if (!list.contains(element)) {
      return list.add(element);
    }
  }
  return false;
}

}