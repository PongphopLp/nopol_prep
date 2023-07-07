import java.util.*;

public class Target {

String byteArrayToStr(byte[] data,int nOfs,int nLen){
  int nAvailCapacity, nSBufPos;
  StringBuffer sbuf;
  nLen&=~1;
  nAvailCapacity=data.length - nOfs;
  if (nAvailCapacity < nLen) {
    nLen=nAvailCapacity;
  }
  sbuf=new StringBuffer();
  sbuf.setLength(nLen >> 1);
  nSBufPos=0;
  while (0 < nLen) {
    sbuf.setCharAt(nSBufPos++,(char)((data[nOfs] << 8) | (data[nOfs + 1] & 0x0ff)));
    nOfs+=2;
    nLen-=2;
  }
  return sbuf.toString();
}
  String __target__(byte[] data,int nOfs,int nLen){
  int nAvailCapacity, nSBufPos;
  StringBuffer sbuf;
  nLen&=~1;
  nAvailCapacity=data.length - nOfs;
  if (nAvailCapacity < nLen) {
    nLen=nAvailCapacity;
  }
  sbuf=new StringBuffer();
  sbuf.setLength(nLen >> 1);
  nSBufPos=0;
  while (0 < nLen) {
    nOfs+=2;
    nLen-=2;
  }
  return sbuf.toString();
}

}