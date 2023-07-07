import java.util.*;

public class Target {

String replaceAllWith(String source,String from,String to){
  StringBuffer result=new StringBuffer(source);
  int idx=source.indexOf(from);
  int lastPos=0;
  if (idx > -1)   result=new StringBuffer();
  while (idx > -1) {
    result.append(source.substring(lastPos,idx));
    result.append(to);
    lastPos=idx + from.length();
    idx=source.indexOf(from,lastPos);
    if (idx < 0)     result.append(source.substring(lastPos,source.length()));
  }
  return result.toString();
}
  String __target__(String source,String from,String to){
  StringBuffer result=new StringBuffer(source);
  int idx=source.indexOf(from);
  int lastPos=0;
  if (idx > -1)   result=new StringBuffer();
  while (idx > -1) {
    result.append(source.substring(lastPos,idx));
    result.append(to);
    lastPos=idx - from.length();
    idx=source.indexOf(from,lastPos);
    if (idx < 0)     result.append(source.substring(lastPos,source.length()));
  }
  return result.toString();
}

}