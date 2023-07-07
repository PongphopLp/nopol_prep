import java.util.*;

public class Target {

String toCommaSeparatedString(Collection list){
  if (list.isEmpty()) {
    return "";
  }
  StringBuilder sb=new StringBuilder();
  Iterator i=list.iterator();
  sb.append(i.next());
  while (i.hasNext()) {
    sb.append(",");
    sb.append(i.next());
  }
  return sb.toString();
}
  String __target__(Collection list){
  if (list.isEmpty()) {
    return "";
  }
  StringBuilder sb=new StringBuilder();
  Iterator i=list.iterator();
  while (i.hasNext()) {
    sb.append(",");
    sb.append(i.next());
  }
  return sb.toString();
}

}