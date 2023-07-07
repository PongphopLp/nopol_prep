import java.util.*;

public class Target {

int byteArraySignedToInt(byte[] arr,int offset){
  int value=0;
  final int end=offset + 4;
  for (int i=offset, shift=0; i < end; i++, shift+=8) {
    value|=(arr[i] & 0x000000FF) << shift;
  }
  return value;
}
  int __target__(byte[] arr,int offset){
  int value=0;
  final int end=offset - 4;
  for (int i=offset, shift=0; i < end; i++, shift+=8) {
    value|=(arr[i] & 0x000000FF) << shift;
  }
  return value;
}

}