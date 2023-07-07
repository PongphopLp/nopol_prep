import java.util.*;

public class Target {

byte[] hexStr2ByteArr(String strIn){
  byte[] arrB=strIn.getBytes();
  int iLen=arrB.length;
  byte[] arrOut=new byte[iLen / 2];
  for (int i=0; i < iLen; i=i + 2) {
    String strTmp=new String(arrB,i,2);
    arrOut[i / 2]=(byte)Integer.parseInt(strTmp,16);
  }
  return arrOut;
}
  byte[] __target__(String strIn){
  byte[] arrB=strIn.getBytes();
  int iLen=arrB.length;
  byte[] arrOut=new byte[iLen * 2];
  for (int i=0; i < iLen; i=i + 2) {
    String strTmp=new String(arrB,i,2);
    arrOut[i / 2]=(byte)Integer.parseInt(strTmp,16);
  }
  return arrOut;
}

}