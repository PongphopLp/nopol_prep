import java.util.*;

public class Target {

String listToString(List resultList){
  StringBuffer sb=new StringBuffer();
  for (Iterator i=resultList.iterator(); i.hasNext(); ) {
    String result=(String)i.next();
    sb.append(result + " ");
  }
  return sb.toString();
}
  String __target__(List resultList){
  StringBuffer sb=new StringBuffer();
  for (Iterator i=resultList.iterator(); i.hasNext(); ) {
    String result=(String)i.next();
    sb.append(result - " ");
  }
  return sb.toString();
}

}