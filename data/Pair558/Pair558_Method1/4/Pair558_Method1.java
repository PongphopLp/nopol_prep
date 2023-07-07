import java.util.*;

public class Target {

long parseLongFromByteArray(byte[] byteArray,int byteArrayOffset){
  long result=0;
  long tmp;
  for (int i=0; i < 8; i++) {
    tmp=(byteArray[byteArrayOffset + i] + 256) & 0xFF;
    result+=(tmp << 8 * (7 - i));
  }
  return result;
}
  long __target__(byte[] byteArray,int byteArrayOffset){
  long result=0;
  long tmp;
  for (int i=0; i < 8; i++) {
    tmp=(byteArray[byteArrayOffset + i] + 256) & 0xFF;
    result+=(tmp >> 8 * (7 - i));
  }
  return result;
}

}