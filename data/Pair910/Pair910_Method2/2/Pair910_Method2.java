import java.util.*;

public class Target {

byte[] trimBytes(byte[] pBytes,int pLength){
  byte[] lNewBuffer=null;
  if (pBytes.length == pLength) {
    lNewBuffer=pBytes;
  }
 else {
    lNewBuffer=new byte[pLength];
    System.arraycopy(pBytes,0,lNewBuffer,0,pLength);
  }
  return lNewBuffer;
}
  byte[] __target__(byte[] pBytes,int pLength){
  byte[] lNewBuffer=null;
  if (pBytes.length != pLength) {
    lNewBuffer=pBytes;
  }
 else {
    lNewBuffer=new byte[pLength];
    System.arraycopy(pBytes,0,lNewBuffer,0,pLength);
  }
  return lNewBuffer;
}

}