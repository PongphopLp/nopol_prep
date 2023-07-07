import java.util.*;

public class Target {

String replaceAll(String source,String findToken,String replaceToken){
  if (source == null) {
    return null;
  }
  StringBuilder sb=null;
  int pos;
  do {
    if ((pos=source.indexOf(findToken)) < 0) {
      break;
    }
    if (sb == null) {
      sb=new StringBuilder();
    }
    if (pos > 0) {
      sb.append(source.substring(0,pos));
    }
    sb.append(replaceToken);
    source=source.substring(pos + findToken.length());
  }
 while (source.length() > 0);
  if (sb == null) {
    return source;
  }
 else {
    sb.append(source);
    return sb.toString();
  }
}
  String __target__(String source,String findToken,String replaceToken){
  if (source == null) {
    return null;
  }
  StringBuilder sb=null;
  int pos;
  do {
    if ((pos=source.indexOf(findToken)) < 0) {
      break;
    }
    if (sb == null) {
      sb=new StringBuilder();
    }
    if (pos <= 0) {
      sb.append(source.substring(0,pos));
    }
    sb.append(replaceToken);
    source=source.substring(pos + findToken.length());
  }
 while (source.length() > 0);
  if (sb == null) {
    return source;
  }
 else {
    sb.append(source);
    return sb.toString();
  }
}

}