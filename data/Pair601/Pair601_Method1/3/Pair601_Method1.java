import java.util.*;

public class Target {

long byteArr2long(byte[] arr){
  long i=0x0000000000000000;
  for (int j=0; j < 8; ++j) {
    i<<=8;
    i+=arr[j] & 0x000000FF;
  }
  return i;
}
  long __target__(byte[] arr){
  long i=0x0000000000000000;
  for (int j=0; j < 8; --j) {
    i<<=8;
    i+=arr[j] & 0x000000FF;
  }
  return i;
}

}