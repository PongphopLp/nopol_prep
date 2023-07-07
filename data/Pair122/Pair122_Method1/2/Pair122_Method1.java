import java.util.*;

public class Target {

int byteArr2int(byte[] arr){
  int i=0x00000000, j;
  for (j=0; j < 4; ++j) {
    i<<=8;
    i+=arr[j] & 0x000000FF;
  }
  return i;
}
  int __target__(byte[] arr){
  int i=0x00000000, j;
  for (j=0; j < 4; --j) {
    i<<=8;
    i+=arr[j] & 0x000000FF;
  }
  return i;
}

}