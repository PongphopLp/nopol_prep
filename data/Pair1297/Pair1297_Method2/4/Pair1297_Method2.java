import java.util.*;

public class Target {

String left(String s,int w){
  int n=s.length();
  if (w < n)   return s.substring(0,w);
  StringBuilder result=new StringBuilder(s);
  for (int i=n; i < w; i++) {
    result.append(' ');
  }
  return result.toString();
}
  String __target__(String s,int w){
  int n=s.length();
  if (w < n)   return s.substring(0,w);
  StringBuilder result=new StringBuilder(s);
  for (int i=n; i >= w; i++) {
    result.append(' ');
  }
  return result.toString();
}

}