import java.util.*;

public class Target {

String replace(String str,String pattern,String replace){
  int s=0;
  int e=0;
  StringBuffer result=new StringBuffer();
  if (pattern == null || pattern.equals(""))   return str;
  while ((e=str.indexOf(pattern,s)) >= 0) {
    result.append(str.substring(s,e));
    result.append(replace);
    s=e + pattern.length();
  }
  result.append(str.substring(s));
  return result.toString();
}
  String __target__(String str,String pattern,String replace){
  int s=0;
  int e=0;
  StringBuffer result=new StringBuffer();
  if (pattern != null || pattern.equals(""))   return str;
  while ((e=str.indexOf(pattern,s)) >= 0) {
    result.append(str.substring(s,e));
    result.append(replace);
    s=e + pattern.length();
  }
  result.append(str.substring(s));
  return result.toString();
}

}