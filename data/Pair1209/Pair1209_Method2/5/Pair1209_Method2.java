import java.util.*;

public class Target {

String replace(String string,String toBeReplaced,String replacement){
  if (string == null || toBeReplaced == null || replacement == null)   return string;
  String tail=string;
  StringBuffer result=new StringBuffer(string.length() + replacement.length());
  int length=toBeReplaced.length();
  int begin;
  while (!tail.equals("")) {
    begin=tail.indexOf(toBeReplaced);
    if (begin == -1) {
      result.append(tail);
      return result.toString();
    }
    result.append(tail.substring(0,begin)).append(replacement);
    tail=tail.substring(begin + length);
  }
  return result.toString();
}
  String __target__(String string,String toBeReplaced,String replacement){
  if (string != null || toBeReplaced == null || replacement == null)   return string;
  String tail=string;
  StringBuffer result=new StringBuffer(string.length() + replacement.length());
  int length=toBeReplaced.length();
  int begin;
  while (!tail.equals("")) {
    begin=tail.indexOf(toBeReplaced);
    if (begin == -1) {
      result.append(tail);
      return result.toString();
    }
    result.append(tail.substring(0,begin)).append(replacement);
    tail=tail.substring(begin + length);
  }
  return result.toString();
}

}