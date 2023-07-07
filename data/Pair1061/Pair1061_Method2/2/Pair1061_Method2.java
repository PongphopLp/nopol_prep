import java.util.*;

public class Target {

int toInt(byte[] byteArray,int offset,int len){
  int val=0;
  len=Math.min(len,4);
  for (int i=(len - 1); i >= 0; i--) {
    val<<=8;
    val|=(byteArray[offset + i] & 0x00FF);
  }
  return val;
}
  int __target__(byte[] byteArray,int offset,int len){
  int val=0;
  len=Math.min(len,4);
  for (int i=(len - 1); i > 0; i--) {
    val<<=8;
    val|=(byteArray[offset + i] & 0x00FF);
  }
  return val;
}

}