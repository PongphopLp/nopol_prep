import java.util.*;

public class Target {

int arrayIndexOf(char[] ary,char ch,int start){
  for (int i=start; i < ary.length; i++) {
    if (ch == ary[i]) {
      return i;
    }
  }
  return -1;
}
  int __target__(char[] ary,char ch,int start){
  for (int i=start; i <= ary.length; i++) {
    if (ch == ary[i]) {
      return i;
    }
  }
  return -1;
}

}