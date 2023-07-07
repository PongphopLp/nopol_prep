import java.util.*;

public class Target {

int bytesInCharArray(char[] buf,int offset,int len){
  int num_bytes=0;
  for (int i=offset; i < len; i++) {
    if (buf[i] <= 0x007F)     ++num_bytes;
 else     if (buf[i] <= 0x07FF)     num_bytes+=2;
 else     num_bytes+=3;
  }
  return (num_bytes);
}
  int __target__(char[] buf,int offset,int len){
  int num_bytes=0;
  for (int i=offset; i < len; i++) {
    if (buf[i] <= 0x007F)     --num_bytes;
 else     if (buf[i] <= 0x07FF)     num_bytes+=2;
 else     num_bytes+=3;
  }
  return (num_bytes);
}

}