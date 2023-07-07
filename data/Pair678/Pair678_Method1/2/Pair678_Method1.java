import java.util.*;

public class Target {

List removeDuplicates(List list){
  int s=list.size();
  ArrayList ulist=new ArrayList(s);
  Set set=new HashSet(s * 4 / 3,.75f);
  Iterator it=list.iterator();
  while (it.hasNext()) {
    Object o=it.next();
    if (set.add(o))     ulist.add(o);
  }
  ulist.trimToSize();
  return ulist;
}
  List __target__(List list){
  int s=list.size();
  ArrayList ulist=new ArrayList(s);
  Set set=new HashSet(s * 4 / 3,.75f);
  Iterator it=list.iterator();
  while (it.hasNext()) {
    Object o=it.next();
    if (set.add(o))     ulist.add(o);
  }
  return ulist;
}

}