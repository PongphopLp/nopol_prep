import java.util.*;

public class Target {

String pad(String s,int length,char c,boolean leading){
  if (s.length() >= length) {
    return s;
  }
 else {
    StringBuffer buf=new StringBuffer(length);
    if (!leading) {
      buf.append(s);
    }
    for (int i=s.length(); i < length; ++i) {
      buf.append(c);
    }
    if (leading) {
      buf.append(s);
    }
    return buf.toString();
  }
}
  String __target__(String s,int length,char c,boolean leading){
  if (s.length() >= length) {
    return s;
  }
 else {
    StringBuffer buf=new StringBuffer(length);
    if (!leading) {
      buf.append(s);
    }
    for (int i=s.length(); i < length; ++i) {
    }
    if (leading) {
      buf.append(s);
    }
    return buf.toString();
  }
}

}