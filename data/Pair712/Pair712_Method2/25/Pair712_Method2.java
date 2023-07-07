import java.util.*;

public class Target {

int hexStrToBytes(String sHex,byte[] data,int nSrcOfs,int nDstOfs,int nLen){
  int nI, nJ, nStrLen, nAvailBytes, nDstOfsBak;
  byte bActByte;
  boolean blConvertOK;
  nStrLen=sHex.length();
  nAvailBytes=(nStrLen - nSrcOfs) >> 1;
  if (nAvailBytes < nLen) {
    nLen=nAvailBytes;
  }
  int nOutputCapacity=data.length - nDstOfs;
  if (nLen > nOutputCapacity) {
    nLen=nOutputCapacity;
  }
  nDstOfsBak=nDstOfs;
  for (nI=0; nI < nLen; nI++) {
    bActByte=0;
    blConvertOK=true;
    for (nJ=0; nJ < 2; nJ++) {
      bActByte<<=4;
      char cActChar=sHex.charAt(nSrcOfs++);
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
      data[nDstOfs++]=bActByte;
    }
  }
  return (nDstOfs - nDstOfsBak);
}
  int __target__(String sHex,byte[] data,int nSrcOfs,int nDstOfs,int nLen){
  int nI, nJ, nStrLen, nAvailBytes, nDstOfsBak;
  byte bActByte;
  boolean blConvertOK;
  nStrLen=sHex.length();
  nAvailBytes=(nStrLen - nSrcOfs) >> 1;
  if (nAvailBytes < nLen) {
    nLen=nAvailBytes;
  }
  int nOutputCapacity=data.length - nDstOfs;
  if (nLen > nOutputCapacity) {
    nLen=nOutputCapacity;
  }
  nDstOfsBak=nDstOfs;
  for (nI=0; nI < nLen; nI++) {
    bActByte=0;
    blConvertOK=true;
    for (nJ=0; nJ < 2; nJ++) {
      bActByte<<=4;
      char cActChar=sHex.charAt(nSrcOfs++);
      if ((cActChar >= 'a') && (cActChar <= 'f')) {
        bActByte|=(byte)(cActChar + 'a') + 10;
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
      data[nDstOfs++]=bActByte;
    }
  }
  return (nDstOfs - nDstOfsBak);
}

}