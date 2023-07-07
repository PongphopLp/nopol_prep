import java.util.*;

public class Target {

String replace(String source,String from,String to){
  StringBuffer sb=new StringBuffer();
  int oldIndex=0, newIndex;
  while (-1 != (newIndex=source.indexOf(from,oldIndex))) {
    sb.append(source.substring(oldIndex,newIndex)).append(to);
    oldIndex=newIndex + from.length();
  }
  if (oldIndex < source.length())   sb.append(source.substring(oldIndex));
  return sb.toString();
}
  String __target__(String source,String from,String to){
  StringBuffer sb=new StringBuffer();
  int oldIndex=0, newIndex;
  while (1 != (newIndex=source.indexOf(from,oldIndex))) {
    sb.append(source.substring(oldIndex,newIndex)).append(to);
    oldIndex=newIndex + from.length();
  }
  if (oldIndex < source.length())   sb.append(source.substring(oldIndex));
  return sb.toString();
}

}