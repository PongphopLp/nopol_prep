import java.util.*;

public class Target {

String join(List list,String delim){
  if (list == null || list.size() < 1) {
    return null;
  }
  StringBuffer buf=new StringBuffer();
  Iterator i=list.iterator();
  while (i.hasNext()) {
    buf.append((String)i.next());
    if (i.hasNext()) {
      buf.append(delim);
    }
  }
  return buf.toString();
}
  String __target__(List list,String delim){
  if (list == null || list.size() < 1) {
    return null;
  }
  StringBuffer buf=new StringBuffer();
  Iterator i=list.iterator();
  while (i.hasNext()) {
    if (i.hasNext()) {
      buf.append(delim);
    }
  }
  return buf.toString();
}

}