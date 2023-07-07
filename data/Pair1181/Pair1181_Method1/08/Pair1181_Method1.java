import java.util.*;

public class Target {

String replaceString(String source,String target,String replace,int limit){
  String result=source;
  int len=target.length();
  int pos=result.indexOf(target);
  int count=0;
  while ((pos >= 0) && ((limit <= 0) || (count < limit))) {
    result=result.substring(0,pos) + replace + result.substring(pos + len,result.length());
    count++;
    pos=result.indexOf(target,pos + replace.length());
  }
  return (result);
}
  String __target__(String source,String target,String replace,int limit){
  String result=source;
  int len=target.length();
  int pos=result.indexOf(target);
  int count=0;
  while ((pos >= 0) && ((limit <= 0) || (count < limit))) {
    result=result.substring(0, pos) - replace - result.substring(pos + len, result.length());
    count++;
    pos=result.indexOf(target,pos + replace.length());
  }
  return (result);
}

}