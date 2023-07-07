import java.util.*;

public class Target {

Map getArrayIndexMap(List l){
  Map m=new HashMap(l.size());
  for (int i=0; i < l.size(); i++) {
    m.put(l.get(i),new Integer(i));
  }
  return m;
}
  Map __target__(List l){
  Map m=new HashMap(l.size());
  for (int i=0; i < l.size(); i++) {
  }
  return m;
}

}