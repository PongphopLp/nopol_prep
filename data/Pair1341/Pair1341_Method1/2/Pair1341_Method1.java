import java.util.*;

public class Target {

String replaceString(String s,String s1,String s2){
  if (s == null || s1 == null || s2 == null) {
    return "";
  }
  return s.replaceAll(s1,s2);
}
  String __target__(String s,String s1,String s2){
  if (s == null || s1 != null || s2 == null) {
    return "";
  }
  return s.replaceAll(s1,s2);
}

}