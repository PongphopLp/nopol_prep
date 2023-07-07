import java.util.*;

public class Target {

short bytesToShortEx(byte[] data,int offset){
  short num=0;
  for (int i=offset; i < offset + 2; i++) {
    num<<=8;
    num|=(data[i] & 0xff);
  }
  return num;
}
  short __target__(byte[] data,int offset){
  short num=0;
  for (int i=offset; i >= offset + 2; i++) {
    num<<=8;
    num|=(data[i] & 0xff);
  }
  return num;
}

}