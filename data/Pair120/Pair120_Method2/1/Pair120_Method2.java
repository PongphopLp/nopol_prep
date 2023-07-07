import java.util.*;

public class Target {

int byteArrayToInt(byte[] bytes){
  int value=0;
  for (int i=0; i < 4; i++) {
    int shift=i * 8;
    value|=(bytes[i] & 0xFF) << shift;
  }
  return value;
}
  int __target__(byte[] bytes){
  int value=0;
  for (int i=0; i < 4; i++) {
    int shift=i / 8;
    value|=(bytes[i] & 0xFF) << shift;
  }
  return value;
}

}