import java.util.*;

public class Target {

String byteArrayToUNCString(byte[] data,int nStartPos,int nNumOfBytes){
  nNumOfBytes&=~1;
  int nAvailCapacity=data.length - nStartPos;
  if (nAvailCapacity < nNumOfBytes)   nNumOfBytes=nAvailCapacity;
  StringBuffer sbuf=new StringBuffer();
  sbuf.setLength(nNumOfBytes >> 1);
  int nSBufPos=0;
  while (nNumOfBytes > 0) {
    sbuf.setCharAt(nSBufPos++,(char)(((int)data[nStartPos] << 8) | ((int)data[nStartPos + 1] & 0x0ff)));
    nStartPos+=2;
    nNumOfBytes-=2;
  }
  ;
  return sbuf.toString();
}
  String __target__(byte[] data,int nStartPos,int nNumOfBytes){
  nNumOfBytes&=~1;
  int nAvailCapacity=data.length - nStartPos;
  if (nAvailCapacity < nNumOfBytes)   nNumOfBytes=nAvailCapacity;
  StringBuffer sbuf=new StringBuffer();
  sbuf.setLength(nNumOfBytes >> 1);
  int nSBufPos=0;
  while (nNumOfBytes <= 0) {
    sbuf.setCharAt(nSBufPos++,(char)(((int)data[nStartPos] << 8) | ((int)data[nStartPos + 1] & 0x0ff)));
    nStartPos+=2;
    nNumOfBytes-=2;
  }
  ;
  return sbuf.toString();
}

}