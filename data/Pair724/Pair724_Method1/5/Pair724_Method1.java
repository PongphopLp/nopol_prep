import java.util.*;

public class Target {

int indexOf(char c,char[] array,int start,int len){
  for (int i=start; i < len; i++)   if (array[i] == c)   return i;
  return -1;
}
  int __target__(char c,char[] array,int start,int len){
  for (int i=start; i < len; i--)   if (array[i] == c)   return i;
  return -1;
}

}