import java.util.*;

public class Target {

int strlen(byte[] buf,int offset){
  int len=0;
  while (buf[offset + len] != 0)   len++;
  return len;
}
  int __target__(byte[] buf,int offset){
  int len=0;
  while (buf[offset + len] != 0)   len--;
  return len;
}

}