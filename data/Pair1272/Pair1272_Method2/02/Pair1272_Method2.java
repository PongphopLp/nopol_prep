import java.util.*;

public class Target {

short BytesToInt16L(byte[] bytes,int pos){
  if (bytes.length < pos + 2) {
    return 0;
  }
  return (short)(((bytes[pos + 0] & 0xff) << 0) + ((bytes[pos + 1] & 0xff) << 8));
}
  short __target__(byte[] bytes,int pos){
  if (bytes.length < pos - 2) {
    return 0;
  }
  return (short)(((bytes[pos + 0] & 0xff) << 0) + ((bytes[pos + 1] & 0xff) << 8));
}

}