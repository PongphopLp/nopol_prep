import java.util.*;

public class Target {

String createListProperty(List list,String sSeparator){
  StringBuffer values=new StringBuffer();
  Iterator iter=list.iterator();
  boolean bFirst=true;
  while (iter.hasNext()) {
    if (bFirst) {
      bFirst=false;
    }
 else {
      values.append(sSeparator);
    }
    values.append(iter.next());
  }
  return values.toString();
}
  String __target__(List list,String sSeparator){
  StringBuffer values=new StringBuffer();
  Iterator iter=list.iterator();
  boolean bFirst=true;
  while (iter.hasNext()) {
    if (bFirst) {
      bFirst=false;
    }
 else {
    }
    values.append(iter.next());
  }
  return values.toString();
}

}