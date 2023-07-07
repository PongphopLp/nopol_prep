import java.util.*;

public class Target {

String listToString(List src,String delim){
  StringBuffer ret=new StringBuffer();
  int i=0;
  for (Iterator iter=src.iterator(); iter.hasNext(); i++) {
    if (i > 0)     ret.append(delim);
    String element=(String)iter.next();
    ret.append(element);
  }
  return ret.toString();
}
  String __target__(List src,String delim){
  StringBuffer ret=new StringBuffer();
  int i=0;
  for (Iterator iter=src.iterator(); iter.hasNext(); i++) {
    if (i > 0)
    String element=(String)iter.next();
    ret.append(element);
  }
  return ret.toString();
}

}