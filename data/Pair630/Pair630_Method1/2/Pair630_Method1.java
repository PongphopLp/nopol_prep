import java.util.*;

public class Target {

int ByteArrayToInteger(byte[] array,int offset){
  int value=0;
  for (int i=0; i < 4; i++) {
    value+=(array[offset + i] & 0xff) << (8 * i);
  }
  return value;
}
  int __target__(byte[] array,int offset){
  int value=0;
  for (int i=0; i < 4; i++) {
    value+=(array[offset + i] | 0xff) << (8 * i);
  }
  return value;
}

}