import java.util.*;

public class Target {

int parseIntFromByteArray(byte[] byteArray,int byteArrayOffset){
  int result=0;
  int tmp;
  for (int i=0; i < 4; i++) {
    tmp=(byteArray[byteArrayOffset + i] + 256) & 0xFF;
    result+=(tmp << 8 * (3 - i));
  }
  return result;
}
  int __target__(byte[] byteArray,int byteArrayOffset){
  int result=0;
  int tmp;
  for (int i=0; i < 4; i--) {
    tmp=(byteArray[byteArrayOffset + i] + 256) & 0xFF;
    result+=(tmp << 8 * (3 - i));
  }
  return result;
}

}