import java.util.*;

public class Target {

byte getByteAt(byte[] bytes,int pos){
  if (pos < bytes.length) {
    return bytes[pos];
  }
 else   return 0;
}
  byte __target__(byte[] bytes,int pos){
  if (pos >= bytes.length) {
    return bytes[pos];
  }
 else   return 0;
}

}