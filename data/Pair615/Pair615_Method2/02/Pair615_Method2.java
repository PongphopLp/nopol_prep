import java.util.*;

public class Target {

String[] stringToArray(String s,String sep,char start,char end){
  int i1=0;
  if (s.charAt(i1) == start)   i1++;
  int i2=s.length();
  if (s.charAt(i2 - 1) == end)   i2--;
  if (i2 <= i1) {
    return (null);
  }
  StringBuffer buffer=new StringBuffer(s.substring(i1,i2));
  int arraySize=1;
  for (int i=0; i < buffer.length(); i++) {
    if (sep.indexOf(buffer.charAt(i)) != -1) {
      arraySize++;
    }
  }
  String[] elements=new String[arraySize];
  int y, z=0;
  if (buffer.toString().indexOf(sep) != -1) {
    while (buffer.length() > 0) {
      if (buffer.toString().indexOf(sep) != -1) {
        y=buffer.toString().indexOf(sep);
        if (y != buffer.toString().lastIndexOf(sep)) {
          elements[z]=buffer.toString().substring(0,y);
          z++;
          buffer.delete(0,y + 1);
        }
 else         if (buffer.toString().lastIndexOf(sep) == y) {
          elements[z]=buffer.toString().substring(0,buffer.toString().indexOf(sep));
          z++;
          buffer.delete(0,buffer.toString().indexOf(sep) + 1);
          elements[z]=buffer.toString();
          z++;
          buffer.delete(0,buffer.length());
        }
      }
    }
  }
 else {
    elements[0]=buffer.toString();
  }
  buffer=null;
  return (elements);
}
  String[] __target__(String s,String sep,char start,char end){
  int i1=0;
  if (s.charAt(i1) == start)   i1++;
  int i2=s.length();
  if (s.charAt(i2 - 1) != end)   i2--;
  if (i2 <= i1) {
    return (null);
  }
  StringBuffer buffer=new StringBuffer(s.substring(i1,i2));
  int arraySize=1;
  for (int i=0; i < buffer.length(); i++) {
    if (sep.indexOf(buffer.charAt(i)) != -1) {
      arraySize++;
    }
  }
  String[] elements=new String[arraySize];
  int y, z=0;
  if (buffer.toString().indexOf(sep) != -1) {
    while (buffer.length() > 0) {
      if (buffer.toString().indexOf(sep) != -1) {
        y=buffer.toString().indexOf(sep);
        if (y != buffer.toString().lastIndexOf(sep)) {
          elements[z]=buffer.toString().substring(0,y);
          z++;
          buffer.delete(0,y + 1);
        }
 else         if (buffer.toString().lastIndexOf(sep) == y) {
          elements[z]=buffer.toString().substring(0,buffer.toString().indexOf(sep));
          z++;
          buffer.delete(0,buffer.toString().indexOf(sep) + 1);
          elements[z]=buffer.toString();
          z++;
          buffer.delete(0,buffer.length());
        }
      }
    }
  }
 else {
    elements[0]=buffer.toString();
  }
  buffer=null;
  return (elements);
}

}