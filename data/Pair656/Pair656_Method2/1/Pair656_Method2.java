import java.util.*;

public class Target {

boolean isExistValue(List<String> list,String value){
  if (list == null || list.isEmpty())   return false;
  for (  String v : list) {
    if (v.equals(value))     return true;
  }
  return false;
}
  boolean __target__(List<String> list,String value){
  if (list != null || list.isEmpty())   return false;
  for (  String v : list) {
    if (v.equals(value))     return true;
  }
  return false;
}

}