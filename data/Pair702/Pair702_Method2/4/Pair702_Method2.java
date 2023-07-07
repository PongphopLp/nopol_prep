import java.util.*;

public class Target {

String prepad(String s,int length,char c){
  int needed=length - s.length();
  if (needed <= 0) {
    return s;
  }
  StringBuffer sb=new StringBuffer(length);
  for (int i=0; i < needed; i++) {
    sb.append(c);
  }
  sb.append(s);
  return (sb.toString());
}
  String __target__(String s,int length,char c){
  int needed=length - s.length();
  if (needed < 0) {
    return s;
  }
  StringBuffer sb=new StringBuffer(length);
  for (int i=0; i < needed; i++) {
    sb.append(c);
  }
  sb.append(s);
  return (sb.toString());
}

}