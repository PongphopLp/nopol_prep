import java.util.*;

public class Target {

int binHexToBytes(String sBinHex,byte[] data,int nSrcPos,int nDstPos,int nNumOfBytes){
  int nStrLen=sBinHex.length();
  int nAvailBytes=(nStrLen - nSrcPos) >> 1;
  if (nAvailBytes < nNumOfBytes) {
    nNumOfBytes=nAvailBytes;
  }
  int nOutputCapacity=data.length - nDstPos;
  if (nNumOfBytes > nOutputCapacity) {
    nNumOfBytes=nOutputCapacity;
  }
  int nResult=0;
  for (int nI=0; nI < nNumOfBytes; nI++) {
    byte bActByte=0;
    boolean blConvertOK=true;
    for (int nJ=0; nJ < 2; nJ++) {
      bActByte<<=4;
      char cActChar=sBinHex.charAt(nSrcPos++);
      if ((cActChar >= 'a') && (cActChar <= 'f')) {
        bActByte|=(byte)(cActChar - 'a') + 10;
      }
 else {
        if ((cActChar >= '0') && (cActChar <= '9')) {
          bActByte|=(byte)(cActChar - '0');
        }
 else {
          blConvertOK=false;
        }
      }
    }
    if (blConvertOK) {
      data[nDstPos++]=bActByte;
      nResult++;
    }
  }
  return nResult;
}
  int __target__(String sBinHex,byte[] data,int nSrcPos,int nDstPos,int nNumOfBytes){
  int nStrLen=sBinHex.length();
  int nAvailBytes=(nStrLen - nSrcPos) >> 1;
  if (nAvailBytes <= nNumOfBytes) {
    nNumOfBytes=nAvailBytes;
  }
  int nOutputCapacity=data.length - nDstPos;
  if (nNumOfBytes > nOutputCapacity) {
    nNumOfBytes=nOutputCapacity;
  }
  int nResult=0;
  for (int nI=0; nI < nNumOfBytes; nI++) {
    byte bActByte=0;
    boolean blConvertOK=true;
    for (int nJ=0; nJ < 2; nJ++) {
      bActByte<<=4;
      char cActChar=sBinHex.charAt(nSrcPos++);
      if ((cActChar >= 'a') && (cActChar <= 'f')) {
        bActByte|=(byte)(cActChar - 'a') + 10;
      }
 else {
        if ((cActChar >= '0') && (cActChar <= '9')) {
          bActByte|=(byte)(cActChar - '0');
        }
 else {
          blConvertOK=false;
        }
      }
    }
    if (blConvertOK) {
      data[nDstPos++]=bActByte;
      nResult++;
    }
  }
  return nResult;
}

}