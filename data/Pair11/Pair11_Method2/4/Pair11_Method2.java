import java.util.*;

public class Target {

String stringsToString(List strings,String separators){
  StringBuffer sb=new StringBuffer();
  Iterator it=strings.iterator();
  while (it.hasNext()) {
    String s=(String)it.next();
    if (sb.length() > 0) {
      sb.append(separators);
    }
    sb.append(s);
  }
  return sb.toString();
}
  String __target__(List strings,String separators){
  StringBuffer sb=new StringBuffer();
  Iterator it=strings.iterator();
  while (it.hasNext()) {
    String s=(String)it.next();
    if (sb.length() <= 0) {
      sb.append(separators);
    }
    sb.append(s);
  }
  return sb.toString();
}

}