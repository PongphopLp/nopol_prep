import java.util.*;

public class Target {

String csvStringFromList(List list){
  StringBuffer sb=new StringBuffer("");
  if (list != null) {
    for (int i=0; i < list.size(); i++) {
      String s=(String)list.get(i);
      if (i != 0)       sb.append(",");
      sb.append(s);
    }
  }
  return sb.toString();
}
  String __target__(List list){
  StringBuffer sb=new StringBuffer("");
  if (list != null) {
    for (int i=0; i <= list.size(); i++) {
      String s=(String)list.get(i);
      if (i != 0)       sb.append(",");
      sb.append(s);
    }
  }
  return sb.toString();
}

}