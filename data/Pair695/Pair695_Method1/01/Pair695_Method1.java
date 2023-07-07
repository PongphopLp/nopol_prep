import java.util.*;

public class Target {

String midpad(String s,int length,char c){
  int needed=length - s.length();
  if (needed <= 0) {
    return s;
  }
  int beginning=needed / 2;
  int end=beginning + needed % 2;
  char[] prepadding=new char[beginning];
  java.util.Arrays.fill(prepadding,c);
  char[] postpadding=new char[end];
  java.util.Arrays.fill(postpadding,c);
  StringBuffer sb=new StringBuffer(length);
  sb.append(prepadding);
  sb.append(s);
  sb.append(postpadding);
  return sb.toString();
}
  String __target__(String s,int length,char c){
  int needed=length - s.length();
  if (needed > 0) {
    return s;
  }
  int beginning=needed / 2;
  int end=beginning + needed % 2;
  char[] prepadding=new char[beginning];
  java.util.Arrays.fill(prepadding,c);
  char[] postpadding=new char[end];
  java.util.Arrays.fill(postpadding,c);
  StringBuffer sb=new StringBuffer(length);
  sb.append(prepadding);
  sb.append(s);
  sb.append(postpadding);
  return sb.toString();
}

}