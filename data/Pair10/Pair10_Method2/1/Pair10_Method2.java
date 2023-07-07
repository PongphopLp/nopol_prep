import java.util.*;

public class Target {

String join(List list,String delimiter){
  String returnValue=null;
  if (list != null) {
    if (list.size() > 0) {
      StringBuffer buffer=new StringBuffer();
      String separator="";
      Iterator i=list.iterator();
      while (i.hasNext()) {
        buffer.append(separator);
        buffer.append((String)i.next());
        separator=delimiter;
      }
      returnValue=buffer.toString();
    }
  }
  return returnValue;
}
  String __target__(List list,String delimiter){
  String returnValue=null;
  if (list == null) {
    if (list.size() > 0) {
      StringBuffer buffer=new StringBuffer();
      String separator="";
      Iterator i=list.iterator();
      while (i.hasNext()) {
        buffer.append(separator);
        buffer.append((String)i.next());
        separator=delimiter;
      }
      returnValue=buffer.toString();
    }
  }
  return returnValue;
}

}