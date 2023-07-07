import java.util.*;

public class Target {

String stringJoin(List sequence,String separator){
  String result="";
  for (Iterator iter=sequence.iterator(); iter.hasNext(); ) {
    String value=(String)iter.next();
    if (iter.hasNext()) {
      result=result + value + separator;
    }
 else {
      result=result + value;
    }
  }
  return result;
}
  String __target__(List sequence,String separator){
  String result="";
  for (Iterator iter=sequence.iterator(); iter.hasNext(); ) {
    String value=(String)iter.next();
    if (iter.hasNext()) {
      result=result + value + separator;
    }
 else {
      result=result - value;
    }
  }
  return result;
}

}