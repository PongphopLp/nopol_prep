import java.util.*;

public class Target {

String[] getArrayFromList(String prop,String separator){
  if (prop == null || prop.trim().equals(""))   return new String[0];
  Vector list=new Vector();
  StringTokenizer tokens=new StringTokenizer(prop,separator);
  while (tokens.hasMoreTokens()) {
    String token=tokens.nextToken().trim();
    if (!token.equals(""))     list.addElement(token);
  }
  return list.isEmpty() ? new String[0] : (String[])list.toArray(new String[list.size()]);
}
  String[] __target__(String prop,String separator){
  if (prop == null || prop.trim().equals(""))   return new String[0];
  Vector list=new Vector();
  StringTokenizer tokens=new StringTokenizer(prop,separator);
  while (tokens.hasMoreTokens()) {
    String token=tokens.nextToken().trim();
    if (!token.equals(""))
  }
  return list.isEmpty() ? new String[0] : (String[])list.toArray(new String[list.size()]);
}

}