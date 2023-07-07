import java.util.*;

public class Target {

String[] stringToArray(String s,String sep,char start,char end){
  int i1=0;
  if (s.charAt(i1) == start) {
    i1++;
  }
  int i2=s.length();
  if (s.charAt(i2 - 1) == end) {
    i2--;
  }
  if (i2 <= i1) {
    return null;
  }
  StringBuffer buf=new StringBuffer(s.substring(i1,i2));
  int arraysize=1;
  for (int i=0; i < buf.length(); i++) {
    if (sep.indexOf(buf.charAt(i)) != -1) {
      arraysize++;
    }
  }
  String[] elements=new String[arraysize];
  int y, z=0;
  if (buf.toString().indexOf(sep) != -1) {
    while (buf.length() > 0) {
      if (buf.toString().indexOf(sep) != -1) {
        y=buf.toString().indexOf(sep);
        if (y != buf.toString().lastIndexOf(sep)) {
          elements[z]=buf.toString().substring(0,y);
          z++;
          buf.delete(0,y + 1);
        }
 else         if (buf.toString().lastIndexOf(sep) == y) {
          elements[z]=buf.toString().substring(0,buf.toString().indexOf(sep));
          z++;
          buf.delete(0,buf.toString().indexOf(sep) + 1);
          elements[z]=buf.toString();
          z++;
          buf.delete(0,buf.length());
        }
      }
    }
  }
 else {
    elements[0]=buf.toString();
  }
  buf=null;
  return elements;
}
  String[] __target__(String s,String sep,char start,char end){
  int i1=0;
  if (s.charAt(i1) == start) {
    i1++;
  }
  int i2=s.length();
  if (s.charAt(i2 - 1) == end) {
    i2--;
  }
  if (i2 <= i1) {
    return null;
  }
  StringBuffer buf=new StringBuffer(s.substring(i1,i2));
  int arraysize=1;
  for (int i=0; i < buf.length(); i++) {
    if (sep.indexOf(buf.charAt(i)) != -1) {
      arraysize++;
    }
  }
  String[] elements=new String[arraysize];
  int y, z=0;
  if (buf.toString().indexOf(sep) != -1) {
    while (buf.length() > 0) {
      if (buf.toString().indexOf(sep) != -1) {
        y=buf.toString().indexOf(sep);
        if (y != buf.toString().lastIndexOf(sep)) {
          elements[z]=buf.toString().substring(0,y);
          z++;
          buf.delete(0,y + 1);
        }
 else         if (buf.toString().lastIndexOf(sep) == y) {
          elements[z]=buf.toString().substring(0,buf.toString().indexOf(sep));
          z++;
          buf.delete(0,buf.toString().indexOf(sep) + 1);
          elements[z]=buf.toString();
          z++;
        }
      }
    }
  }
 else {
    elements[0]=buf.toString();
  }
  buf=null;
  return elements;
}

}