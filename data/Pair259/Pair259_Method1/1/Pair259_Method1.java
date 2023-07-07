import java.util.*;

public class Target {

String findBestName(Map map,String name){
  String best;
  String curr;
  int lastdot;
  Iterator i;
  if (map == null || name == null) {
    return null;
  }
  best="";
synchronized (map) {
    for (i=map.keySet().iterator(); i.hasNext(); ) {
      curr=(String)i.next();
      if (name.equals(curr)) {
        best=curr;
        break;
      }
      if ((lastdot=name.lastIndexOf(".")) >= 0) {
        if (name.substring(0,lastdot).startsWith(curr) && curr.length() > best.length()) {
          best=curr;
        }
      }
    }
  }
  return best;
}
  String __target__(Map map,String name){
  String best;
  String curr;
  int lastdot;
  Iterator i;
  if (map != null || name == null) {
    return null;
  }
  best="";
synchronized (map) {
    for (i=map.keySet().iterator(); i.hasNext(); ) {
      curr=(String)i.next();
      if (name.equals(curr)) {
        best=curr;
        break;
      }
      if ((lastdot=name.lastIndexOf(".")) >= 0) {
        if (name.substring(0,lastdot).startsWith(curr) && curr.length() > best.length()) {
          best=curr;
        }
      }
    }
  }
  return best;
}

}