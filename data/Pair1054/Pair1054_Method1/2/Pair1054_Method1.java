import java.util.*;

public class Target {

int getInt(byte[] arr,int offset,int bytes){
  int result=0;
  for (int i=0; i < bytes; i++) {
    result<<=8;
    result|=arr[offset++] & 0xFF;
  }
  return result;
}
  int __target__(byte[] arr,int offset,int bytes){
  int result=0;
  for (int i=0; i >= bytes; i++) {
    result<<=8;
    result|=arr[offset++] & 0xFF;
  }
  return result;
}

}