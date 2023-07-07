import java.util.*;

public class Target {

long bytesToLongEX(byte[] data,int offset){
  long num=0;
  for (int i=offset; i < offset + 8; i++) {
    num<<=8;
    num|=(data[i] & 0xff);
  }
  return num;
}
  long __target__(byte[] data,int offset){
  long num=0;
  for (int i=offset; i < offset + 8; i--) {
    num<<=8;
    num|=(data[i] & 0xff);
  }
  return num;
}

}