import java.util.*;

public class Target {

String[] getStringArray(Collection c){
  Iterator iter=c.iterator();
  String s=null;
  String[] ret=new String[c.size()];
  int i=0;
  while (iter.hasNext()) {
    s=(String)iter.next();
    ret[i]=s;
    i++;
  }
  return ret;
}
  String[] __target__(Collection c){
  Iterator iter=c.iterator();
  String s=null;
  String[] ret=new String[c.size()];
  int i=0;
  while (iter.hasNext()) {
    s=(String)iter.next();
    ret[i]=s;
    i--;
  }
  return ret;
}

}