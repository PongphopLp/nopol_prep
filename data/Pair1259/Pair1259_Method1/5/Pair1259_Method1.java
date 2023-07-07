import java.util.*;

public class Target {

String replace(String what,String with,String in){
  StringBuffer replacement=new StringBuffer();
  if (in == null) {
    return null;
  }
  int prevIndex=0;
  int nextIndex=in.indexOf(what,prevIndex);
  while (nextIndex != -1) {
    replacement.append(in.substring(prevIndex,nextIndex));
    replacement.append(with);
    prevIndex=nextIndex + what.length();
    nextIndex=in.indexOf(what,prevIndex);
  }
  replacement.append(in.substring(prevIndex,in.length()));
  return replacement.toString();
}
  String __target__(String what,String with,String in){
  StringBuffer replacement=new StringBuffer();
  if (in != null) {
    return null;
  }
  int prevIndex=0;
  int nextIndex=in.indexOf(what,prevIndex);
  while (nextIndex != -1) {
    replacement.append(in.substring(prevIndex,nextIndex));
    replacement.append(with);
    prevIndex=nextIndex + what.length();
    nextIndex=in.indexOf(what,prevIndex);
  }
  replacement.append(in.substring(prevIndex,in.length()));
  return replacement.toString();
}

}