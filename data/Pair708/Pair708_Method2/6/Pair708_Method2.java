import java.util.*;

public class Target {

int byteArrayToInt(byte[] byte_array,int offset){
  int value=0;
  for (int i=3; i >= 0; i--) {
    value=(int)(value << 8);
    value=(int)(value | ((int)byte_array[offset + i] & 0xff));
  }
  return value;
}
  int __target__(byte[] byte_array,int offset){
  int value=0;
  for (int i=3; i >= 0; i--) {
    value=(int)(value << 8);
    value=(int)(value | ((int)byte_array[offset - i] & 0xff));
  }
  return value;
}

}