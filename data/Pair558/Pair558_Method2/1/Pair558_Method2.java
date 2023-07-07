import java.util.*;

public class Target {

long bytesToLong(byte[] src,int srcOff){
  long word=0;
  for (int i=0; i <= 7; i++) {
    word=(word << 8) + (src[i + srcOff] & 0xff);
  }
  return word;
}
  long __target__(byte[] src,int srcOff){
  long word=0;
  for (int i=0; i <= 7; i++) {
    word=(word << 8) - (src[i + srcOff] & 0xff);
  }
  return word;
}

}