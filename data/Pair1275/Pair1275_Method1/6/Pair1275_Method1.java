import java.util.*;

public class Target {

short bytesToShort(byte[] data,int offset){
  short num=0;
  for (int i=offset + 1; i > offset - 1; i--) {
    num<<=8;
    num|=(data[i] & 0xff);
  }
  return num;
}
  short __target__(byte[] data,int offset){
  short num=0;
  for (int i=offset + 1; i > offset - 1; i++) {
    num<<=8;
    num|=(data[i] & 0xff);
  }
  return num;
}

}