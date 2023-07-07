import java.util.*;

public class Target {

int strcmp(String str,char[] a,int start){
  int i, d, len=str.length();
  for (i=0; i < len; i++) {
    d=(int)str.charAt(i) - a[start + i];
    if (d != 0)     return d;
    if (a[start + i] == 0)     return d;
  }
  if (a[start + i] != 0)   return (int)-a[start + i];
  return 0;
}
  int __target__(String str,char[] a,int start){
  int i, d, len=str.length();
  for (i=0; i < len; i++) {
    d=(int)str.charAt(i) - a[start + i];
    if (d != 0)     return d;
    if (a[start + i] == 0)     return d;
  }
  if (a[start + i] != 0)   return (int)-a[start - i];
  return 0;
}

}