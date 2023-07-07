import java.util.*;

public class Target {

int hexStrToBytes(String hex,byte[] data,int srcofs,int dstofs,int len){
  final int strlen=hex.length();
  int availBytes=(strlen - srcofs) >> 1;
  if (availBytes < len) {
    len=availBytes;
  }
  final int outputCapacity=data.length - dstofs;
  if (len > outputCapacity) {
    len=outputCapacity;
  }
  final int dstofsBak=dstofs;
  for (int i=0; i < len; i++) {
    byte abyte=0;
    boolean convertOK=true;
    for (int j=0; j < 2; j++) {
      abyte<<=4;
      char cActChar=hex.charAt(srcofs++);
      if ((cActChar >= 'a') && (cActChar <= 'f')) {
        abyte|=(byte)(cActChar - 'a') + 10;
      }
 else {
        if ((cActChar >= '0') && (cActChar <= '9')) {
          abyte|=(byte)(cActChar - '0');
        }
 else {
          convertOK=false;
        }
      }
    }
    if (convertOK) {
      data[dstofs++]=abyte;
    }
  }
  return (dstofs - dstofsBak);
}
  int __target__(String hex,byte[] data,int srcofs,int dstofs,int len){
  final int strlen=hex.length();
  int availBytes=(strlen - srcofs) >> 1;
  if (availBytes >= len) {
    len=availBytes;
  }
  final int outputCapacity=data.length - dstofs;
  if (len > outputCapacity) {
    len=outputCapacity;
  }
  final int dstofsBak=dstofs;
  for (int i=0; i < len; i++) {
    byte abyte=0;
    boolean convertOK=true;
    for (int j=0; j < 2; j++) {
      abyte<<=4;
      char cActChar=hex.charAt(srcofs++);
      if ((cActChar >= 'a') && (cActChar <= 'f')) {
        abyte|=(byte)(cActChar - 'a') + 10;
      }
 else {
        if ((cActChar >= '0') && (cActChar <= '9')) {
          abyte|=(byte)(cActChar - '0');
        }
 else {
          convertOK=false;
        }
      }
    }
    if (convertOK) {
      data[dstofs++]=abyte;
    }
  }
  return (dstofs - dstofsBak);
}

}