import java.util.*;

public class Target {

long ByteArrayToLong(byte[] array,int offset){
  long value=0;
  for (int i=0; i < 8; i++) {
    value=(value << 8) + (array[offset + i] & 0xff);
  }
  return value;
}
  long __target__(byte[] array,int offset){
  long value=0;
  for (int i=0; i >= 8; i++) {
    value=(value << 8) + (array[offset + i] & 0xff);
  }
  return value;
}

}