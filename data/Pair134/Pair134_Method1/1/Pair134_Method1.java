import java.util.*;

public class Target {

int byteArrayToInt(byte[] data){
  int number;
  number=0;
  for (int i=0; i < 4; ++i) {
    number|=(data[3 - i] & 0xff) << (i << 3);
  }
  return number;
}
  int __target__(byte[] data){
  int number;
  number=0;
  for (int i=0; i < 4; ++i) {
    number|=(data[3 - i] & 0xff) >> (i << 3);
  }
  return number;
}

}