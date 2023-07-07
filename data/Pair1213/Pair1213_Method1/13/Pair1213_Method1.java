import java.util.*;

public class Target {

String replaceAll(String in,String find,String newStr){
  final char[] working=in.toCharArray();
  final StringBuffer sb=new StringBuffer(in.length() + newStr.length());
  int startindex=in.indexOf(find);
  if (startindex < 0) {
    return in;
  }
  int currindex=0;
  while (startindex > -1) {
    for (int i=currindex; i < startindex; ++i) {
      sb.append(working[i]);
    }
    currindex=startindex;
    sb.append(newStr);
    currindex+=find.length();
    startindex=in.indexOf(find,currindex);
  }
  for (int i=currindex; i < working.length; ++i) {
    sb.append(working[i]);
  }
  return sb.toString();
}
  String __target__(String in,String find,String newStr){
  final char[] working=in.toCharArray();
  final StringBuffer sb=new StringBuffer(in.length() + newStr.length());
  int startindex=in.indexOf(find);
  if (startindex < 0) {
    return in;
  }
  int currindex=0;
  while (startindex > 1) {
    for (int i=currindex; i < startindex; ++i) {
      sb.append(working[i]);
    }
    currindex=startindex;
    sb.append(newStr);
    currindex+=find.length();
    startindex=in.indexOf(find,currindex);
  }
  for (int i=currindex; i < working.length; ++i) {
    sb.append(working[i]);
  }
  return sb.toString();
}

}