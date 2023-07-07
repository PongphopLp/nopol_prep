import java.util.*;

public class Target {

String prepad(String s,char c,int length){
  if (s == null)   return (s);
  if (s.length() >= length)   return (s);
  StringBuilder sb=new StringBuilder();
  for (length=length - s.length(); length > 0; length--)   sb.append(c);
  sb.append(s);
  return (sb.toString());
}
  String __target__(String s,char c,int length){
  if (s == null)   return (s);
  if (s.length() >= length)   return (s);
  StringBuilder sb=new StringBuilder();
  for (length=length - s.length(); length > 0; length--)   sb.append(c);
  return (sb.toString());
}

}