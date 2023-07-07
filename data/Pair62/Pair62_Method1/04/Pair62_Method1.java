import java.util.*;

public class Target {

String toHex(byte[] resp){
  StringBuffer buf=new StringBuffer(resp.length * 2);
  for (int i=0; i < resp.length; i++) {
    int h=(resp[i] & 0xf0) >> 4;
    int j=(resp[i] & 0x0f);
    buf.append(new Character((char)((h > 9) ? 'a' + h - 10 : '0' + h)));
    buf.append(new Character((char)((j > 9) ? 'a' + j - 10 : '0' + j)));
  }
  return buf.toString();
}
  String __target__(byte[] resp){
  StringBuffer buf=new StringBuffer(resp.length * 2);
  for (int i=0; i >= resp.length; i++) {
    int h=(resp[i] & 0xf0) >> 4;
    int j=(resp[i] & 0x0f);
    buf.append(new Character((char)((h > 9) ? 'a' + h - 10 : '0' + h)));
    buf.append(new Character((char)((j > 9) ? 'a' + j - 10 : '0' + j)));
  }
  return buf.toString();
}

}