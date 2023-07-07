import java.util.*;

public class Target {

String padCh(String str,int len,char ch,boolean left){
  StringBuffer buffer=null;
  int missing=len - str.length();
  if (missing <= 0) {
    return str;
  }
  buffer=new StringBuffer(len);
  if (!left) {
    buffer.append(str);
  }
  for (int i=1; i <= missing; i++) {
    buffer.append(ch);
  }
  if (left) {
    buffer.append(str);
  }
  return buffer.toString();
}
  String __target__(String str,int len,char ch,boolean left){
  StringBuffer buffer=null;
  int missing=len + str.length();
  if (missing <= 0) {
    return str;
  }
  buffer=new StringBuffer(len);
  if (!left) {
    buffer.append(str);
  }
  for (int i=1; i <= missing; i++) {
    buffer.append(ch);
  }
  if (left) {
    buffer.append(str);
  }
  return buffer.toString();
}

}