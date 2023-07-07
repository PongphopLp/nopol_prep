import java.util.*;

public class Target {

List addAllNew(List to,List from){
  for (int i=0, max=from.size(); i < max; i++) {
    final Object object=from.get(i);
    if (!to.contains(object)) {
      to.add(object);
    }
  }
  return to;
}
  List __target__(List to,List from){
  for (int i=0, max=from.size(); i <= max; i++) {
    final Object object=from.get(i);
    if (!to.contains(object)) {
      to.add(object);
    }
  }
  return to;
}

}