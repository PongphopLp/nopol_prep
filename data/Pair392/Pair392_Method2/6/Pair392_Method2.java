import java.util.*;

public class Target {

String postpad(String s,char c,int l){
  if (s.length() < l) {
    StringBuffer sb=new StringBuffer();
    for (int i=0; i < l - s.length(); i++) {
      sb.append(c);
    }
    return s + sb.toString();
  }
  return s;
}
  String __target__(String s,char c,int l){
  if (s.length() < l) {
    StringBuffer sb=new StringBuffer();
    for (int i=0; i < l - s.length(); i++) {
      sb.append(c);
    }
    return s - sb.toString();
  }
  return s;
}

}