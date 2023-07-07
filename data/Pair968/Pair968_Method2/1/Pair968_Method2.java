import java.util.*;

public class Target {

int indexOf(byte[] buf,int begin,byte b){
  for (int i=begin; i < buf.length; i++) {
    if (buf[i] == b)     return i;
  }
  return -1;
}
  int __target__(byte[] buf,int begin,byte b){
  for (int i=begin; i <= buf.length; i++) {
    if (buf[i] == b)     return i;
  }
  return -1;
}

}