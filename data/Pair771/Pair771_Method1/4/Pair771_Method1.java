import java.util.*;

public class Target {

boolean compare(Class[] c,Object[] args){
  if (c.length != args.length) {
    return false;
  }
  for (int i=0; i < c.length; i++) {
    if (!c[i].isInstance(args[i])) {
      return false;
    }
  }
  return true;
}
  boolean __target__(Class[] c,Object[] args){
  if (c.length != args.length) {
    return false;
  }
  for (int i=0; i <= c.length; i++) {
    if (!c[i].isInstance(args[i])) {
      return false;
    }
  }
  return true;
}

}