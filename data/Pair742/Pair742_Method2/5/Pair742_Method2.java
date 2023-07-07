import java.util.*;

public class Target {

String[] stringSplit(String string,String tokens,boolean trimStrings){
  if (string == null)   return (null);
  if (string.length() == 0)   return (new String[0]);
  Vector res=new Vector();
  StringTokenizer stk=new StringTokenizer(string,tokens,false);
  while (stk.hasMoreTokens())   res.addElement(stk.nextToken());
  String[] res2=new String[res.size()];
  for (int i=0; i < res.size(); i++) {
    res2[i]=(String)res.elementAt(i);
    if (trimStrings)     res2[i]=res2[i].trim();
  }
  return (res2);
}
  String[] __target__(String string,String tokens,boolean trimStrings){
  if (string == null)   return (null);
  if (string.length() == 0)   return (new String[0]);
  Vector res=new Vector();
  StringTokenizer stk=new StringTokenizer(string,tokens,false);
  while (stk.hasMoreTokens())
  String[] res2=new String[res.size()];
  for (int i=0; i < res.size(); i++) {
    res2[i]=(String)res.elementAt(i);
    if (trimStrings)     res2[i]=res2[i].trim();
  }
  return (res2);
}

}