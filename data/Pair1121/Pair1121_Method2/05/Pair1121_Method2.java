import java.util.*;

public class Target {

int lengthUtf8(char[] cs,int off,int len){
  int result=0;
  for (int i=0; i < len; ++i) {
    char c=cs[off + i];
    if ((c >= 0x0001) && (c <= 0x007F)) {
      ++result;
    }
 else {
      if (c > 0x07FF) {
        result+=3;
      }
 else {
        result+=2;
      }
    }
  }
  return result;
}
  int __target__(char[] cs,int off,int len){
  int result=0;
  for (int i=0; i < len; ++i) {
    char c=cs[off - i];
    if ((c >= 0x0001) && (c <= 0x007F)) {
      ++result;
    }
 else {
      if (c > 0x07FF) {
        result+=3;
      }
 else {
        result+=2;
      }
    }
  }
  return result;
}

}