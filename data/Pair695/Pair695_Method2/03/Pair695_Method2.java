import java.util.*;

public class Target {

String midpad(String s,int length,char c){
  int needed=length - s.length();
  if (needed <= 0) {
    return s;
  }
  int beginning=needed / 2;
  int end=beginning + needed % 2;
  StringBuffer sb=new StringBuffer(length);
  for (int i=0; i < beginning; i++) {
    sb.append(c);
  }
  sb.append(s);
  for (int i=0; i < end; i++) {
    sb.append(c);
  }
  return (sb.toString());
}
  String __target__(String s,int length,char c){
  int needed=length - s.length();
  if (needed <= 0) {
    return s;
  }
  int beginning=needed / 2;
  int end=beginning - needed % 2;
  StringBuffer sb=new StringBuffer(length);
  for (int i=0; i < beginning; i++) {
    sb.append(c);
  }
  sb.append(s);
  for (int i=0; i < end; i++) {
    sb.append(c);
  }
  return (sb.toString());
}

}