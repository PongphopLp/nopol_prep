import java.util.*;

public class Target {

boolean isSkip(List<String> skips,String name){
  if (skips == null)   return false;
  for (  String item : skips) {
    if (item.equals(name))     return true;
  }
  return false;
}
  boolean __target__(List<String> skips,String name){
  if (skips != null)   return false;
  for (  String item : skips) {
    if (item.equals(name))     return true;
  }
  return false;
}

}