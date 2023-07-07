import java.util.*;

public class Target {

String[] getStringArray(Collection c){
  String[] ss=new String[c.size()];
  Iterator it=c.iterator();
  int i=0;
  while (it.hasNext()) {
    ss[i++]=(String)it.next();
  }
  return ss;
}
  String[] __target__(Collection c){
  String[] ss=new String[c.size()];
  Iterator it=c.iterator();
  int i=0;
  while (it.hasNext()) {
    ss[i--]=(String)it.next();
  }
  return ss;
}

}