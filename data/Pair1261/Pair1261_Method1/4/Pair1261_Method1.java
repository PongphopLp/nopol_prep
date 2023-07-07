import java.util.*;

public class Target {

String stripExtraDelimiters(String in,char delim){
  char[] chars=in.toCharArray();
  int c=chars.length - 1;
  boolean found=false;
  while (c >= 0 && !found) {
    if (chars[c--] != delim)     found=true;
  }
  String ret="";
  if (found)   ret=String.valueOf(chars,0,c + 2);
  return ret;
}
  String __target__(String in,char delim){
  char[] chars=in.toCharArray();
  int c=chars.length - 1;
  boolean found=false;
  while (c >= 0 && !found) {
    if (chars[c++] != delim)     found=true;
  }
  String ret="";
  if (found)   ret=String.valueOf(chars,0,c + 2);
  return ret;
}

}