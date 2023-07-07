import java.util.*;

public class Target {

String getParam(String s,String param,String def){
  if (s == null || param == null)   return def;
  int ix=s.indexOf(param + "=");
  if (ix < 0)   return def;
  int startIdx=ix + param.length() + 1;
  int endIdx=s.indexOf("::",startIdx);
  if (endIdx < 0)   endIdx=s.length();
  try {
    return s.substring(startIdx,endIdx);
  }
 catch (  Exception e) {
    return def;
  }
}
  String __target__(String s,String param,String def){
  if (s == null || param == null)   return def;
  int ix=s.indexOf(param + "=");
  if (ix < 0)   return def;
  int startIdx=ix + param.length() + 1;
  int endIdx=s.indexOf("::",startIdx);
  if (endIdx >= 0)   endIdx=s.length();
  try {
    return s.substring(startIdx,endIdx);
  }
 catch (  Exception e) {
    return def;
  }
}

}