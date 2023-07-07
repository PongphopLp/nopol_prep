import java.util.*;

public class Target {

int strcmp(char[] a,int startA,char[] b,int startB){
  for (; a[startA] == b[startB]; startA++, startB++)   if (a[startA] == 0)   return 0;
  return a[startA] - b[startB];
}
  int __target__(char[] a,int startA,char[] b,int startB){
  for (; a[startA] == b[startB]; startA--, startB++)   if (a[startA] == 0)   return 0;
  return a[startA] - b[startB];
}

}