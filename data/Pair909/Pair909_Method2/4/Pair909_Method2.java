import java.util.*;

public class Target {

byte[] getByteSubArray(byte[] arr,int start,int length){
  byte[] arr_out=new byte[length];
  int j=0;
  for (int i=start; i < start + length; i++) {
    arr_out[j]=arr[i];
    j++;
  }
  return arr_out;
}
  byte[] __target__(byte[] arr,int start,int length){
  byte[] arr_out=new byte[length];
  int j=0;
  for (int i=start; i < start + length; i--) {
    arr_out[j]=arr[i];
    j++;
  }
  return arr_out;
}

}