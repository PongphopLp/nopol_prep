import java.util.*;

public class Target {

Map getIndexMap(List list){
  Map indexes=new HashMap();
  int index=0;
  for (Iterator it=list.iterator(); it.hasNext(); ) {
    indexes.put(it.next(),new Integer(index++));
  }
  return indexes;
}
  Map __target__(List list){
  Map indexes=new HashMap();
  int index=0;
  for (Iterator it=list.iterator(); it.hasNext(); ) {
    indexes.put(it.next(),new Integer(index--));
  }
  return indexes;
}

}