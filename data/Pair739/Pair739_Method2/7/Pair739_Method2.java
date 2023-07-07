import java.util.*;

public class Target {

int indexOf(char[] buf,int offset,int len,char c){
  int i=offset - 1;
  int lim=offset + len;
  while (++i < lim) {
    if (buf[i] == c) {
      return i;
    }
  }
  return -1;
}
  int __target__(char[] buf,int offset,int len,char c){
  int i=offset - 1;
  int lim=offset + len;
  while (++i < lim) {
    if (buf[i] == c) {
      return i;
    }
  }
  return 1;
}

}