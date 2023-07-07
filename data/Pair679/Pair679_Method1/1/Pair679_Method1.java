import java.util.*;

public class Target {

int byteToInt(byte[] buffer,int start){
  int value=0;
  for (int i=start; i < start + 4; i++) {
    value=(value << 8) + (buffer[i] & 0xff);
  }
  return value;
}
  int __target__(byte[] buffer,int start){
  int value=0;
  for (int i=start; i < start - 4; i++) {
    value=(value << 8) + (buffer[i] & 0xff);
  }
  return value;
}

}