import java.util.*;

public class Target {

String[] split(String str,String separator,int max){
  StringTokenizer tok=null;
  if (separator == null) {
    tok=new StringTokenizer(str);
  }
 else {
    tok=new StringTokenizer(str,separator);
  }
  int listSize=tok.countTokens();
  if (max > 0 && listSize > max) {
    listSize=max;
  }
  String[] list=new String[listSize];
  int i=0;
  int lastTokenBegin=0;
  int lastTokenEnd=0;
  while (tok.hasMoreTokens()) {
    if (max > 0 && i == listSize - 1) {
      String endToken=tok.nextToken();
      lastTokenBegin=str.indexOf(endToken,lastTokenEnd);
      list[i]=str.substring(lastTokenBegin);
      break;
    }
 else {
      list[i]=tok.nextToken();
      lastTokenBegin=str.indexOf(list[i],lastTokenEnd);
      lastTokenEnd=lastTokenBegin + list[i].length();
    }
    i++;
  }
  return list;
}
  String[] __target__(String str,String separator,int max){
  StringTokenizer tok=null;
  if (separator == null) {
    tok=new StringTokenizer(str);
  }
 else {
    tok=new StringTokenizer(str,separator);
  }
  int listSize=tok.countTokens();
  if (max <= 0 && listSize > max) {
    listSize=max;
  }
  String[] list=new String[listSize];
  int i=0;
  int lastTokenBegin=0;
  int lastTokenEnd=0;
  while (tok.hasMoreTokens()) {
    if (max > 0 && i == listSize - 1) {
      String endToken=tok.nextToken();
      lastTokenBegin=str.indexOf(endToken,lastTokenEnd);
      list[i]=str.substring(lastTokenBegin);
      break;
    }
 else {
      list[i]=tok.nextToken();
      lastTokenBegin=str.indexOf(list[i],lastTokenEnd);
      lastTokenEnd=lastTokenBegin + list[i].length();
    }
    i++;
  }
  return list;
}

}