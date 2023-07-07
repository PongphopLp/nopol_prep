import java.util.*;

public class Target {

String[] convertToArrayStrings(List resourcesAsStrings){
  int len=resourcesAsStrings.size();
  String[] res=new String[len];
  int i=0;
  for (Iterator iterator=resourcesAsStrings.iterator(); iterator.hasNext(); ) {
    String s=(String)iterator.next();
    res[i]=s;
    i++;
  }
  return res;
}
  String[] __target__(List resourcesAsStrings){
  int len=resourcesAsStrings.size();
  String[] res=new String[len];
  int i=0;
  for (Iterator iterator=resourcesAsStrings.iterator(); iterator.hasNext(); ) {
    String s=(String)iterator.next();
    res[i]=s;
    i--;
  }
  return res;
}

}