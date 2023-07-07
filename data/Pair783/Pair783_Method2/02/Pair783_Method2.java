import java.util.*;

public class Target {

String byteArrayToStr(byte[] data,int ofs,int len){
  len&=~1;
  final int availCapacity=data.length - ofs;
  if (availCapacity < len) {
    len=availCapacity;
  }
  final StringBuffer sbuf=new StringBuffer();
  sbuf.setLength(len >> 1);
  int sbufPos=0;
  while (0 < len) {
    sbuf.setCharAt(sbufPos++,(char)((data[ofs] << 8) | (data[ofs + 1] & 0x0ff)));
    ofs+=2;
    len-=2;
  }
  return sbuf.toString();
}
  String __target__(byte[] data,int ofs,int len){
  len&=~1;
  final int availCapacity=data.length - ofs;
  if (availCapacity < len) {
    len=availCapacity;
  }
  final StringBuffer sbuf=new StringBuffer();
  sbuf.setLength(len >> 1);
  int sbufPos=0;
  while (0 >= len) {
    sbuf.setCharAt(sbufPos++,(char)((data[ofs] << 8) | (data[ofs + 1] & 0x0ff)));
    ofs+=2;
    len-=2;
  }
  return sbuf.toString();
}

}