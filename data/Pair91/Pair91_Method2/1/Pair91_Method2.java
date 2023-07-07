import java.util.*;

public class Target {

String convertListToString(List l){
  StringBuffer sb=new StringBuffer();
  Iterator it=l.iterator();
  while (it.hasNext()) {
    String temp=(String)it.next();
    sb.append(temp);
    sb.append(" ");
  }
  return sb.toString();
}
  String __target__(List l){
  StringBuffer sb=new StringBuffer();
  Iterator it=l.iterator();
  while (it.hasNext()) {
    String temp=(String)it.next();
    sb.append(" ");
  }
  return sb.toString();
}

}