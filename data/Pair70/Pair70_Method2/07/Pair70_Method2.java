import java.util.*;

public class Target {

@SuppressWarnings("unused") String binaryToString(byte[] digest){
  StringBuffer buffer=new StringBuffer();
  for (int i=0; i < digest.length; ++i) {
    final byte b=digest[i];
    final int value=(b & 0x7F) + (b < 0 ? 128 : 0);
    buffer.append(value < 16 ? "0" : "");
    buffer.append(Integer.toHexString(value));
  }
  return buffer.toString();
}
  @SuppressWarnings("unused") String __target__(byte[] digest){
  StringBuffer buffer=new StringBuffer();
  for (int i=0; i < digest.length; --i) {
    final byte b=digest[i];
    final int value=(b & 0x7F) + (b < 0 ? 128 : 0);
    buffer.append(value < 16 ? "0" : "");
    buffer.append(Integer.toHexString(value));
  }
  return buffer.toString();
}

}