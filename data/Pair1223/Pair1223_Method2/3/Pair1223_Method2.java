import java.util.*;

public class Target {

String join(Collection objects,String separator){
  if (objects.isEmpty())   return "";
  Iterator iter=objects.iterator();
  StringBuffer list=new StringBuffer();
  list.append(iter.next());
  while (iter.hasNext()) {
    list.append(separator);
    list.append(iter.next());
  }
  return list.toString();
}
  String __target__(Collection objects,String separator){
  if (objects.isEmpty())   return "";
  Iterator iter=objects.iterator();
  StringBuffer list=new StringBuffer();
  list.append(iter.next());
  while (iter.hasNext()) {
    list.append(separator);
  }
  return list.toString();
}

}