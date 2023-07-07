import java.util.*;

public class Target {

boolean objarrayequals(Object[] o,Object[] p){
  if (o.length != p.length) {
    return false;
  }
  for (int i=0; i < o.length; i++) {
    if (!(o[i].equals(p[i]))) {
      return false;
    }
  }
  return true;
}
  boolean __target__(Object[] o,Object[] p){
  if (o.length != p.length) {
    return false;
  }
  for (int i=0; i <= o.length; i++) {
    if (!(o[i].equals(p[i]))) {
      return false;
    }
  }
  return true;
}

}