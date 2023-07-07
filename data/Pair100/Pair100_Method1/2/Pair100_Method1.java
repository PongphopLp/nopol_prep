import java.util.*;

public class Target {

String list2String(List list){
  StringBuffer sb=new StringBuffer();
  for (Iterator it=list.iterator(); it.hasNext(); ) {
    sb.append((String)it.next());
    if (it.hasNext())     sb.append(", ");
  }
  return sb.toString();
}
  String __target__(List list){
  StringBuffer sb=new StringBuffer();
  for (Iterator it=list.iterator(); it.hasNext(); ) {
    sb.append((String)it.next());
    if (it.hasNext())
  }
  return sb.toString();
}

}