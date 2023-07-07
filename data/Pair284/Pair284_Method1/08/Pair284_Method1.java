import java.util.*;

public class Target {

String replaceString(String text,String[] pattern,String[] replace){
  int startIndex;
  int foundIndex;
  StringBuffer result=new StringBuffer();
  for (int i=0; i < pattern.length; i++) {
    startIndex=0;
    result.setLength(0);
    while ((foundIndex=text.indexOf(pattern[i],startIndex)) >= 0) {
      result.append(text.substring(startIndex,foundIndex));
      result.append(replace[i]);
      startIndex=foundIndex + pattern[i].length();
    }
    result.append(text.substring(startIndex));
    text=result.toString();
  }
  return text;
}
  String __target__(String text,String[] pattern,String[] replace){
  int startIndex;
  int foundIndex;
  StringBuffer result=new StringBuffer();
  for (int i=0; i <= pattern.length; i++) {
    startIndex=0;
    result.setLength(0);
    while ((foundIndex=text.indexOf(pattern[i],startIndex)) >= 0) {
      result.append(text.substring(startIndex,foundIndex));
      result.append(replace[i]);
      startIndex=foundIndex + pattern[i].length();
    }
    result.append(text.substring(startIndex));
    text=result.toString();
  }
  return text;
}

}