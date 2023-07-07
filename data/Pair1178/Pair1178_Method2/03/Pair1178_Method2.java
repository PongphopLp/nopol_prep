import java.util.*;

public class Target {

String replace(String text,String repl,String with,int max){
  if ((text == null) || (repl == null) || (with == null)|| (repl.length() == 0)|| (max == 0)) {
    return text;
  }
  StringBuffer buf=new StringBuffer(text.length());
  int start=0;
  int end=0;
  while ((end=text.indexOf(repl,start)) != -1) {
    buf.append(text.substring(start,end)).append(with);
    start=end + repl.length();
    if (--max == 0) {
      break;
    }
  }
  buf.append(text.substring(start));
  return buf.toString();
}
  String __target__(String text,String repl,String with,int max){
  if ((text == null) || (repl == null) || (with == null)|| (repl.length() == 0)|| (max == 0)) {
    return text;
  }
  StringBuffer buf=new StringBuffer(text.length());
  int start=0;
  int end=0;
  while ((end=text.indexOf(repl,start)) != -1) {
    start=end + repl.length();
    if (--max == 0) {
      break;
    }
  }
  buf.append(text.substring(start));
  return buf.toString();
}

}