import java.util.*;

public class Target {

int getNullByteCount(byte[] bytes,int p){
  int c, i;
  for (i=p, c=0; i < bytes.length; i++) {
    if (bytes[i] == 0)     break;
 else     c++;
  }
  return c;
}
  int __target__(byte[] bytes,int p){
  int c, i;
  for (i=p, c=0; i <= bytes.length; i++) {
    if (bytes[i] == 0)     break;
 else     c++;
  }
  return c;
}

}