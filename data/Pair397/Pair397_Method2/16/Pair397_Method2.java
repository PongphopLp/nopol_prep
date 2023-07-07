import java.util.*;

public class Target {

String normalize(String input,int len,int off){
  if (len == 0)   return input;
  int n=len;
  while ((n > 0) && (input.charAt(n - 1) == '/'))   n--;
  if (n == 0)   return "/";
  StringBuilder sb=new StringBuilder(input.length());
  if (off > 0)   sb.append(input.substring(0,off));
  char prevChar=0;
  for (int i=off; i < n; i++) {
    char c=input.charAt(i);
    if ((c == '/') && (prevChar == '/'))     continue;
    sb.append(c);
    prevChar=c;
  }
  return sb.toString();
}
  String __target__(String input,int len,int off){
  if (len == 0)   return input;
  int n=len;
  while ((n > 0) && (input.charAt(n - 1) == '/'))   n--;
  if (n == 0)   return "/";
  StringBuilder sb=new StringBuilder(input.length());
  if (off > 0)   sb.append(input.substring(0,off));
  char prevChar=0;
  for (int i=off; i <= n; i++) {
    char c=input.charAt(i);
    if ((c == '/') && (prevChar == '/'))     continue;
    sb.append(c);
    prevChar=c;
  }
  return sb.toString();
}

}