import java.util.*;

public class Target {

int byteArrayCompare(byte[] arg1,byte[] arg2,int length){
  for (int i=0; i < length; i++) {
    if ((arg1[i] & 0xff) == (arg2[i] & 0xff))     continue;
    return ((arg1[i] & 0xff) < (arg2[i] & 0xff)) ? -1 : 1;
  }
  return 0;
}
  int __target__(byte[] arg1,byte[] arg2,int length){
  for (int i=0; i < length; i++) {
    if ((arg1[i] & 0xff) == (arg2[i] & 0xff))     continue;
    return ((arg1[i] & 0xff) < (arg2[i] | 0xff)) ? -1 : 1;
  }
  return 0;
}

}