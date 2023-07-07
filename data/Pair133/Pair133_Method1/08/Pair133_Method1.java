import java.util.*;

public class Target {

String[] splitString(String str,String delims){
  if (str == null)   return null;
 else   if (str.equals("") || delims == null || delims.length() == 0)   return new String[]{str};
  String[] s;
  Vector v=new Vector();
  int pos, newpos;
  pos=0;
  newpos=str.indexOf(delims,pos);
  while (newpos != -1) {
    v.addElement(str.substring(pos,newpos));
    pos=newpos + delims.length();
    newpos=str.indexOf(delims,pos);
  }
  v.addElement(str.substring(pos));
  s=new String[v.size()];
  for (int i=0; i < s.length; i++) {
    s[i]=(String)v.elementAt(i);
  }
  return s;
}
  String[] __target__(String str,String delims){
  if (str == null)   return null;
 else   if (str.equals("") || delims == null || delims.length() == 0)   return new String[]{str};
  String[] s;
  Vector v=new Vector();
  int pos, newpos;
  pos=0;
  newpos=str.indexOf(delims,pos);
  while (newpos == -1) {
    v.addElement(str.substring(pos,newpos));
    pos=newpos + delims.length();
    newpos=str.indexOf(delims,pos);
  }
  v.addElement(str.substring(pos));
  s=new String[v.size()];
  for (int i=0; i < s.length; i++) {
    s[i]=(String)v.elementAt(i);
  }
  return s;
}

}