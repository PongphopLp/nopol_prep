import java.util.*;

public class Target {

List findRootNodes(Map counts){
  List result=new ArrayList(5);
  for (Iterator i=counts.keySet().iterator(); i.hasNext(); ) {
    Object node=i.next();
    int count=((Integer)counts.get(node)).intValue();
    if (count == 0) {
      result.add(node);
    }
  }
  return result;
}
  List __target__(Map counts){
  List result=new ArrayList(5);
  for (Iterator i=counts.keySet().iterator(); i.hasNext(); ) {
    Object node=i.next();
    int count=((Integer)counts.get(node)).intValue();
    if (count != 0) {
      result.add(node);
    }
  }
  return result;
}

}