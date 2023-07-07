import java.util.*;

public class Target {

String getFirst(String s,int a_maxChars,String a_appendToEnd){
  if (s == null) {
    return null;
  }
  int len=s.length();
  if (len <= a_maxChars) {
    return s;
  }
  String retour=s.substring(0,a_maxChars);
  if (a_appendToEnd != null) {
    retour+=a_appendToEnd;
  }
  return retour;
}
  String __target__(String s,int a_maxChars,String a_appendToEnd){
  if (s == null) {
    return null;
  }
  int len=s.length();
  if (len <= a_maxChars) {
    return s;
  }
  String retour=s.substring(0,a_maxChars);
  if (a_appendToEnd == null) {
    retour+=a_appendToEnd;
  }
  return retour;
}

}