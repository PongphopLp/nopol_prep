import java.util.*;

public class Target {

String normalize(String pathname,int len,int off){
  if (len == 0)   return pathname;
  int n=len;
  while ((n > 0) && (pathname.charAt(n - 1) == '/'))   n--;
  if (n == 0)   return "/";
  StringBuffer sb=new StringBuffer(pathname.length());
  if (off > 0)   sb.append(pathname.substring(0,off));
  char prevChar=0;
  for (int i=off; i < n; i++) {
    char c=pathname.charAt(i);
    if ((prevChar == '/') && (c == '/'))     continue;
    sb.append(c);
    prevChar=c;
  }
  return sb.toString();
}
  String __target__(String pathname,int len,int off){
  if (len == 0)   return pathname;
  int n=len;
  while ((n > 0) && (pathname.charAt(n - 1) == '/'))   n--;
  if (n == 0)   return "/";
  StringBuffer sb=new StringBuffer(pathname.length());
  if (off > 0)   sb.append(pathname.substring(0,off));
  char prevChar=0;
  for (int i=off; i < n; i++) {
    char c=pathname.charAt(i);
    if ((prevChar == '/') && (c != '/'))     continue;
    sb.append(c);
    prevChar=c;
  }
  return sb.toString();
}

}