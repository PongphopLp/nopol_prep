import java.util.*;

public class Target {

boolean in(String[] targets,String value,boolean ignoreCase){
  if (targets == null)   return false;
  for (  String target : targets) {
    if (ignoreCase) {
      if (value.equalsIgnoreCase(target))       return true;
    }
 else {
      if (value.equals(target))       return true;
    }
  }
  return false;
}
  boolean __target__(String[] targets,String value,boolean ignoreCase){
  if (targets != null)   return false;
  for (  String target : targets) {
    if (ignoreCase) {
      if (value.equalsIgnoreCase(target))       return true;
    }
 else {
      if (value.equals(target))       return true;
    }
  }
  return false;
}

}