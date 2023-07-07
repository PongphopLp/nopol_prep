import java.util.*;

public class Target {

int bytesToInt(byte[] data,int offset){
  int num=0;
  for (int i=offset + 3; i > offset - 1; i--) {
    num<<=8;
    num|=(data[i] & 0xff);
  }
  return num;
}
  int __target__(byte[] data,int offset){
  int num=0;
  for (int i=offset + 3; i > offset - 1; i++) {
    num<<=8;
    num|=(data[i] & 0xff);
  }
  return num;
}

}