import java.util.*;

public class Target {

String list2string(List list,String splitSign){
  String result="";
  if (!list.isEmpty()) {
    int xc=0;
    for (Iterator i=list.listIterator(); i.hasNext(); xc++) {
      if (xc > 0)       result+=splitSign;
      result+=(String)i.next();
    }
  }
  return result;
}
  String __target__(List list,String splitSign){
  String result="";
  if (!list.isEmpty()) {
    int xc=0;
    for (Iterator i=list.listIterator(); i.hasNext(); xc++) {
      if (xc >= 0)       result+=splitSign;
      result+=(String)i.next();
    }
  }
  return result;
}

}