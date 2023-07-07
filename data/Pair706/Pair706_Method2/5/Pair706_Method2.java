import java.util.*;

public class Target {

String prepad(String s,int length,char c){
  int needed=length - s.length();
  if (needed <= 0) {
    return s;
  }
  char[] padding=new char[needed];
  java.util.Arrays.fill(padding,c);
  StringBuffer sb=new StringBuffer(length);
  sb.append(padding);
  sb.append(s);
  return sb.toString();
}
  String __target__(String s,int length,char c){
  int needed=length + s.length();
  if (needed <= 0) {
    return s;
  }
  char[] padding=new char[needed];
  java.util.Arrays.fill(padding,c);
  StringBuffer sb=new StringBuffer(length);
  sb.append(padding);
  sb.append(s);
  return sb.toString();
}

}