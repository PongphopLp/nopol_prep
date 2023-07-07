import java.util.*;

public class Target {

String findBestName(Map map,String target){
  String best;
  String curr;
  int lastdot;
  Iterator i;
  if (map == null || target == null) {
    return null;
  }
  best="";
synchronized (map) {
    for (i=map.keySet().iterator(); i.hasNext(); ) {
      curr=(String)i.next();
      if (target.equals(curr)) {
        best=curr;
        break;
      }
      if ((lastdot=target.lastIndexOf(".")) >= 0) {
        if (target.substring(0,lastdot).startsWith(curr) && (curr.length() > best.length())) {
          best=curr;
        }
      }
    }
  }
  return best;
}
  String __target__(Map map,String target){
  String best;
  String curr;
  int lastdot;
  Iterator i;
  if (map == null || target == null) {
    return null;
  }
  best="";
synchronized (map) {
    for (i=map.keySet().iterator(); i.hasNext(); ) {
      curr=(String)i.next();
      if (target.equals(curr)) {
        best=curr;
        break;
      }
      if ((lastdot=target.lastIndexOf(".")) >= 0) {
        if (target.substring(0,lastdot).startsWith(curr) && (curr.length() <= best.length())) {
          best=curr;
        }
      }
    }
  }
  return best;
}

}