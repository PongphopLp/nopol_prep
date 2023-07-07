import java.util.*;

public class Target {

int byteToInt(byte[] array){
  int value=0;
  for (int i=0; i < 4; i++) {
    int b=array[i];
    b&=0xff;
    value|=(b << (i * 8));
  }
  return value;
}
  int __target__(byte[] array){
  int value=0;
  for (int i=0; i < 4; i++) {
    int b=array[i];
    b&=0xff;
    value|=(b >> (i * 8));
  }
  return value;
}

}