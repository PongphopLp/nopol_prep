import java.util.*;

public class Target {

String replace(String in,String what,String with){
  int pos=0, lp=0;
  StringBuffer sb=new StringBuffer();
  while ((pos=in.indexOf(what,lp)) > -1) {
    sb.append(in.substring(lp,pos));
    sb.append(with);
    lp=pos + what.length();
  }
  if (lp < in.length()) {
    sb.append(in.substring(lp));
  }
  return sb.toString();
}
  String __target__(String in,String what,String with){
  int pos=0, lp=0;
  StringBuffer sb=new StringBuffer();
  while ((pos=in.indexOf(what,lp)) > -1) {
    sb.append(in.substring(lp,pos));
    lp=pos + what.length();
  }
  if (lp < in.length()) {
    sb.append(in.substring(lp));
  }
  return sb.toString();
}

}