import java.util.*;

public class Target {

long bytesToLong(byte[] data,int offset){
  long num=0;
  for (int i=offset + 7; i > offset - 1; i--) {
    num<<=8;
    num|=(data[i] & 0xff);
  }
  return num;
}
  long __target__(byte[] data,int offset){
  long num=0;
  for (int i=offset - 7; i > offset - 1; i--) {
    num<<=8;
    num|=(data[i] & 0xff);
  }
  return num;
}

}