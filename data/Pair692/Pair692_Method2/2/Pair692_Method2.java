import java.util.*;

public class Target {

int unpackInt(byte[] array,int index){
  int value=0;
  int shift=0;
  while (shift != 32) {
    value|=(0x000000ff & ((int)array[index])) << shift;
    index++;
    shift+=8;
  }
  return value;
}
  int __target__(byte[] array,int index){
  int value=0;
  int shift=0;
  while (shift == 32) {
    value|=(0x000000ff & ((int)array[index])) << shift;
    index++;
    shift+=8;
  }
  return value;
}

}