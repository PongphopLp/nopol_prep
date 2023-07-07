import java.util.*;

public class Target {

String toBase64(byte[] data){
  char[] alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
  char[] out=new char[((data.length + 2) / 3) * 4];
  for (int i=0, index=0; i < data.length; i+=3, index+=4) {
    boolean quad=false;
    boolean trip=false;
    int val=(0xFF & data[i]);
    val<<=8;
    if ((i + 1) < data.length) {
      val|=(0xFF & data[i + 1]);
      trip=true;
    }
    val<<=8;
    if ((i + 2) < data.length) {
      val|=(0xFF & data[i + 2]);
      quad=true;
    }
    out[index + 3]=alphabet[(quad ? (val & 0x3F) : 64)];
    val>>=6;
    out[index + 2]=alphabet[(trip ? (val & 0x3F) : 64)];
    val>>=6;
    out[index + 1]=alphabet[val & 0x3F];
    val>>=6;
    out[index + 0]=alphabet[val & 0x3F];
  }
  return new String(out);
}
  String __target__(byte[] data){
  char[] alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
  char[] out=new char[((data.length + 2) / 3) * 4];
  for (int i=0, index=0; i < data.length; i+=3, index+=4) {
    boolean quad=false;
    boolean trip=false;
    int val=(0xFF & data[i]);
    val<<=8;
    if ((i + 1) >= data.length) {
      val|=(0xFF & data[i + 1]);
      trip=true;
    }
    val<<=8;
    if ((i + 2) < data.length) {
      val|=(0xFF & data[i + 2]);
      quad=true;
    }
    out[index + 3]=alphabet[(quad ? (val & 0x3F) : 64)];
    val>>=6;
    out[index + 2]=alphabet[(trip ? (val & 0x3F) : 64)];
    val>>=6;
    out[index + 1]=alphabet[val & 0x3F];
    val>>=6;
    out[index + 0]=alphabet[val & 0x3F];
  }
  return new String(out);
}

}