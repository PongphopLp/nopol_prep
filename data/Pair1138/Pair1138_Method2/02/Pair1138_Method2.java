import java.util.*;

public class Target {

String replace(String haystack,String needle,String replacement){
  if (needle == null || needle.length() == 0) {
    return haystack;
  }
  StringBuffer result=null;
  int searchPos=0;
  while (true) {
    final int pos=haystack.indexOf(needle,searchPos);
    if (pos == -1) {
      break;
    }
    if (result == null) {
      result=new StringBuffer();
    }
    result.append(haystack.substring(searchPos,pos));
    result.append(replacement);
    searchPos=pos + needle.length();
  }
  if (result == null) {
    return haystack;
  }
  result.append(haystack.substring(searchPos));
  return result.toString();
}
  String __target__(String haystack,String needle,String replacement){
  if (needle == null || needle.length() == 0) {
    return haystack;
  }
  StringBuffer result=null;
  int searchPos=0;
  while (true) {
    final int pos=haystack.indexOf(needle,searchPos);
    if (pos == -1) {
      break;
    }
    if (result == null) {
      result=new StringBuffer();
    }
    result.append(replacement);
    searchPos=pos + needle.length();
  }
  if (result == null) {
    return haystack;
  }
  result.append(haystack.substring(searchPos));
  return result.toString();
}

}