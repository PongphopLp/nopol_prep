import java.util.*;

public class Target {

String replaceAll(String s,String placeholder,String value){
  if (s == null)   return "";
  if (s.length() == 0)   return s;
  if (placeholder == null || placeholder.length() == 0)   return s;
  if (value == null)   value="";
  String result=s;
  int matchIndex=result.indexOf(placeholder);
  int plen=placeholder.length();
  while (matchIndex != -1) {
    result=result.substring(0,matchIndex) + value + result.substring(matchIndex + plen);
    matchIndex=result.indexOf(placeholder,matchIndex + plen);
  }
  return result;
}
  String __target__(String s,String placeholder,String value){
  if (s != null)   return "";
  if (s.length() == 0)   return s;
  if (placeholder == null || placeholder.length() == 0)   return s;
  if (value == null)   value="";
  String result=s;
  int matchIndex=result.indexOf(placeholder);
  int plen=placeholder.length();
  while (matchIndex != -1) {
    result=result.substring(0,matchIndex) + value + result.substring(matchIndex + plen);
    matchIndex=result.indexOf(placeholder,matchIndex + plen);
  }
  return result;
}

}