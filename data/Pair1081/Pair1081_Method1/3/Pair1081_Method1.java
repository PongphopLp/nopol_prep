import java.util.*;

public class Target {

int iscVaxInteger(byte[] buffer,int pos,int length){
  int value;
  int shift;
  value=shift=0;
  int i=pos;
  while (--length >= 0) {
    value+=(buffer[i++] & 0xff) << shift;
    shift+=8;
  }
  return value;
}
  int __target__(byte[] buffer,int pos,int length){
  int value;
  int shift;
  value=shift=0;
  int i=pos;
  while (++length >= 0) {
    value+=(buffer[i++] & 0xff) << shift;
    shift+=8;
  }
  return value;
}

}