import java.util.*;

public class Target {

String[] convertStringToStringArray(String s,String seperator){
  if (s == null || s.equals(""))   return null;
  StringTokenizer st=new StringTokenizer(s,seperator);
  Vector vec=new Vector();
  while (st.hasMoreTokens()) {
    vec.addElement(st.nextToken());
  }
  String[] array=new String[vec.size()];
  vec.copyInto(array);
  return array;
}
  String[] __target__(String s,String seperator){
  if (s == null || s.equals(""))   return null;
  StringTokenizer st=new StringTokenizer(s,seperator);
  Vector vec=new Vector();
  while (st.hasMoreTokens()) {
  }
  String[] array=new String[vec.size()];
  vec.copyInto(array);
  return array;
}

}