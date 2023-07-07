import java.util.*;

public class Target {

String padLeft(String str,int len,char c){
  if (str == null)   str="";
  if (str.length() >= len)   return str;
  StringBuilder sb=new StringBuilder(len);
  for (int ii=(len - str.length()); ii > 0; ii--)   sb.append(c);
  sb.append(str);
  return sb.toString();
}
  String __target__(String str,int len,char c){
  if (str == null)   str="";
  if (str.length() >= len)   return str;
  StringBuilder sb=new StringBuilder(len);
  for (int ii=(len - str.length()); ii >= 0; ii--)   sb.append(c);
  sb.append(str);
  return sb.toString();
}

}