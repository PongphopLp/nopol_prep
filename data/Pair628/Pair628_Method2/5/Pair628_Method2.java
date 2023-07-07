import java.util.*;

public class Target {

int findNullByte(byte[] data,int start){
  int len=data.length;
  for (int i=start; i < len; i++) {
    if (data[i] == 0) {
      return i;
    }
  }
  return -1;
}
  int __target__(byte[] data,int start){
  int len=data.length;
  for (int i=start; i < len; i--) {
    if (data[i] == 0) {
      return i;
    }
  }
  return -1;
}

}