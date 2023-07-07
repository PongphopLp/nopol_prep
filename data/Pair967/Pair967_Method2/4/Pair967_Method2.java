import java.util.*;

public class Target {

int indexOf(byte[] buf,int len,byte b){
  for (int i=0; i < len; ++i)   if (buf[i] == b)   return i;
  return -1;
}
  int __target__(byte[] buf,int len,byte b){
  for (int i=0; i < len; ++i)   if (buf[i] != b)   return i;
  return -1;
}

}