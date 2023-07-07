import java.util.*;

public class Target {

List combine(List list1,List list2){
  for (Iterator iter=list2.iterator(); iter.hasNext(); ) {
    Object obj=iter.next();
    if (!(list1.contains(obj))) {
      list1.add(obj);
    }
  }
  return list1;
}
  List __target__(List list1,List list2){
  for (Iterator iter=list2.iterator(); iter.hasNext(); ) {
    Object obj=iter.next();
    if (!(list1.contains(obj))) {
    }
  }
  return list1;
}

}