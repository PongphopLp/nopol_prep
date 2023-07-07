import java.util.*;

public class Target {

String join(Collection s,String delimiter){
  StringBuffer buffer=new StringBuffer();
  Iterator iter=s.iterator();
  while (iter.hasNext()) {
    buffer.append(iter.next());
    if (iter.hasNext()) {
      buffer.append(delimiter);
    }
  }
  return buffer.toString();
}
  String __target__(Collection s,String delimiter){
  StringBuffer buffer=new StringBuffer();
  Iterator iter=s.iterator();
  while (iter.hasNext()) {
    buffer.append(iter.next());
    if (iter.hasNext()) {
    }
  }
  return buffer.toString();
}

}