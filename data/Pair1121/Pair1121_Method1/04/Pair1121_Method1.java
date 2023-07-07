import java.util.*;

public class Target {

int calculateUTFLength(char[] chars,int offset,int length){
  int utflen=0;
  for (int i=0; i < length; i++) {
    int c=chars[i + offset];
    if ((c >= 0x0001) && (c <= 0x007F)) {
      utflen++;
    }
 else     if (c > 0x07FF) {
      utflen+=3;
    }
 else {
      utflen+=2;
    }
  }
  return utflen;
}
  int __target__(char[] chars,int offset,int length){
  int utflen=0;
  for (int i=0; i < length; i++) {
    int c=chars[i + offset];
    if ((c >= 0x0001) && (c <= 0x007F)) {
      utflen++;
    }
 else     if (c >= 0x07FF) {
      utflen+=3;
    }
 else {
      utflen+=2;
    }
  }
  return utflen;
}

}