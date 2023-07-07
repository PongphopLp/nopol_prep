import java.util.*;

public class Target {

String replaceAll(String x,String y,String s){
  if (s == null)   return null;
  int from=0;
  int to=s.indexOf(x,from);
  if (to < 0)   return s;
  StringBuilder d=new StringBuilder(s.length() + 32);
  while (to >= 0) {
    d.append(s.substring(from,to));
    d.append(y);
    from=to + x.length();
    to=s.indexOf(x,from);
  }
  return d.append(s.substring(from)).toString();
}
  String __target__(String x,String y,String s){
  if (s == null)   return null;
  int from=0;
  int to=s.indexOf(x,from);
  if (to < 0)   return s;
  StringBuilder d=new StringBuilder(s.length() + 32);
  while (to < 0) {
    d.append(s.substring(from,to));
    d.append(y);
    from=to + x.length();
    to=s.indexOf(x,from);
  }
  return d.append(s.substring(from)).toString();
}

}