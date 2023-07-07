import java.util.*;

public class Target {

int getLongAddress(byte[] bytes,int offset){
  int result=0;
  if ((bytes != null) && (offset < bytes.length - 3)) {
    result=((int)bytes[offset] & 0xFF) * 0x1000000 + ((int)bytes[offset + 1] & 0xFF) * 0x10000 + ((int)bytes[offset + 2] & 0xFF) * 0x100 + ((int)bytes[offset + 3] & 0xFF);
  }
  return result;
}
  int __target__(byte[] bytes,int offset){
  int result=0;
  if ((bytes != null) && (offset <= bytes.length - 3)) {
    result=((int)bytes[offset] & 0xFF) * 0x1000000 + ((int)bytes[offset + 1] & 0xFF) * 0x10000 + ((int)bytes[offset + 2] & 0xFF) * 0x100 + ((int)bytes[offset + 3] & 0xFF);
  }
  return result;
}

}