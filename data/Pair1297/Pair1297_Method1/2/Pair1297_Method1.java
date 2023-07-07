import java.util.*;

public class Target {

String fixedStringLength(String s,int length){
  if (s.length() < length) {
    StringBuffer str=new StringBuffer(s);
    for (int i=0; i < length - s.length(); i++) {
      str.append(" ");
    }
    s=str.toString();
  }
 else   if (s.length() > length) {
    s=s.substring(0,length);
  }
  return s;
}
  String __target__(String s,int length){
  if (s.length() < length) {
    StringBuffer str=new StringBuffer(s);
    for (int i=0; i <= length - s.length(); i++) {
      str.append(" ");
    }
    s=str.toString();
  }
 else   if (s.length() > length) {
    s=s.substring(0,length);
  }
  return s;
}

}