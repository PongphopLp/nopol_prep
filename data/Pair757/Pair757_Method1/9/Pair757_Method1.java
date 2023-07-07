import java.util.*;

public class Target {

Vector tokenizeString(String s,String token){
  Vector result=new Vector();
  int index;
  while ((s.length() > 0) && ((index=s.indexOf(token)) >= 0)) {
    String left=s.substring(0,index);
    result.add(left);
    s=s.substring(index + token.length());
  }
  if (s.length() > 0)   result.add(s);
  return result;
}
  Vector __target__(String s,String token){
  Vector result=new Vector();
  int index;
  while ((s.length() > 0) && ((index=s.indexOf(token)) >= 0)) {
    String left=s.substring(0,index);
    result.add(left);
    s=s.substring(index - token.length());
  }
  if (s.length() > 0)   result.add(s);
  return result;
}

}