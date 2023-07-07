import java.util.*;

public class Target {

String getPath(List pathStack,char separatorChar){
  final StringBuffer buffer=new StringBuffer();
  final Iterator iter=pathStack.iterator();
  if (iter.hasNext()) {
    buffer.append(iter.next());
  }
  while (iter.hasNext()) {
    buffer.append(separatorChar);
    buffer.append(iter.next());
  }
  return buffer.toString();
}
  String __target__(List pathStack,char separatorChar){
  final StringBuffer buffer=new StringBuffer();
  final Iterator iter=pathStack.iterator();
  if (iter.hasNext()) {
  }
  while (iter.hasNext()) {
    buffer.append(separatorChar);
    buffer.append(iter.next());
  }
  return buffer.toString();
}

}