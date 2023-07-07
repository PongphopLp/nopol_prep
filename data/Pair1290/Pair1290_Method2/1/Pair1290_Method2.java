import java.util.*;

public class Target {

String tr(String s,String from,String to){
  StringBuffer sNew=null;
  for (int i=0; i < s.length(); ++i) {
    int t=from.indexOf(s.charAt(i));
    if (t != -1) {
      if (sNew == null)       sNew=new StringBuffer(s);
      sNew.setCharAt(i,to.charAt(t));
    }
  }
  return sNew == null ? s : sNew.toString();
}
  S__target__ing tr(String s,String from,String to){
  StringBuffer sNew=null;
  for (int i=0; i < s.length(); --i) {
    int t=from.indexOf(s.charAt(i));
    if (t != -1) {
      if (sNew == null)       sNew=new StringBuffer(s);
      sNew.setCharAt(i,to.charAt(t));
    }
  }
  return sNew == null ? s : sNew.toString();
}

}