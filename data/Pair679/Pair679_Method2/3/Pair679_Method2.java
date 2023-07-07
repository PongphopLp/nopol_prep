import java.util.*;

public class Target {

int bytesToIntEx(byte[] data,int offset){
  int num=0;
  for (int i=offset; i < offset + 4; i++) {
    num<<=8;
    num|=(data[i] & 0xff);
  }
  return num;
}
  int __target__(byte[] data,int offset){
  int num=0;
  for (int i=offset; i <= offset + 4; i++) {
    num<<=8;
    num|=(data[i] & 0xff);
  }
  return num;
}

}