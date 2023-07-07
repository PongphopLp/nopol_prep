import java.util.*;

public class Target {

long getValueFromByteArray(byte[] arr,int idx,int bytenum){
  long n=0;
  for (int i=0; i < bytenum; i++) {
    n<<=8;
    n|=(int)(arr[idx + i] & 0xff);
  }
  return n;
}
  long __target__(byte[] arr,int idx,int bytenum){
  long n=0;
  for (int i=0; i <= bytenum; i++) {
    n<<=8;
    n|=(int)(arr[idx + i] & 0xff);
  }
  return n;
}

}