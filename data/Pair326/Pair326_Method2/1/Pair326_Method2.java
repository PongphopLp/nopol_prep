import java.util.*;

public class Target {

String[] givenStrings(List list){
  String[] result=new String[list.size()];
  int i=0;
  for (Iterator it=list.iterator(); it.hasNext(); i++)   result[i]=(String)it.next();
  return result;
}
  String[] __target__(List list){
  String[] result=new String[list.size()];
  int i=0;
  for (Iterator it=list.iterator(); it.hasNext(); i--)   result[i]=(String)it.next();
  return result;
}

}