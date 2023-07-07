import java.util.*;

public class Target {

int strlen(char[] a,int start){
  int len=0;
  for (int i=start; i < a.length && a[i] != 0; i++)   len++;
  return len;
}
  int __target__(char[] a,int start){
  int len=0;
  for (int i=start; i <= a.length && a[i] != 0; i++)   len++;
  return len;
}

}