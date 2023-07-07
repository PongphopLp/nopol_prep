import java.util.*;

public class Target {

int indexOf(char[] a,int fromIndex,int toIndex,char c){
  while (fromIndex < toIndex) {
    if (a[fromIndex] == c)     return fromIndex;
    ++fromIndex;
  }
  return -1;
}
  int __target__(char[] a,int fromIndex,int toIndex,char c){
  while (fromIndex <= toIndex) {
    if (a[fromIndex] == c)     return fromIndex;
    ++fromIndex;
  }
  return -1;
}

}