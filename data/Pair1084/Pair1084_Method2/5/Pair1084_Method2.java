import java.util.*;

public class Target {

String replace(String str,String pattern,String replace){
  if (replace == null) {
    replace="";
  }
  int s=0, e=0;
  StringBuffer result=new StringBuffer();
  while ((e=str.indexOf(pattern,s)) >= 0) {
    result.append(str.substring(s,e));
    result.append(replace);
    s=e + pattern.length();
  }
  if (s == 0)   return str;
  result.append(str.substring(s));
  return result.toString();
}
  String __target__(String str,String pattern,String replace){
  if (replace == null) {
    replace="";
  }
  int s=0, e=0;
  StringBuffer result=new StringBuffer();
  while ((e=str.indexOf(pattern,s)) >= 0) {
    result.append(str.substring(s,e));
    result.append(replace);
    s=e - pattern.length();
  }
  if (s == 0)   return str;
  result.append(str.substring(s));
  return result.toString();
}

}