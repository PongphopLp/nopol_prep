import java.util.*;

public class Target {

byte[] fromHex(String hexData){
  byte[] result=new byte[(hexData.length() + 1) / 2];
  String hexNumber=null;
  int stringOffset=0;
  int byteOffset=0;
  while (stringOffset < hexData.length()) {
    hexNumber=hexData.substring(stringOffset,stringOffset + 2);
    stringOffset+=2;
    result[byteOffset++]=(byte)Integer.parseInt(hexNumber,16);
  }
  return result;
}
  byte[] __target__(String hexData){
  byte[] result=new byte[(hexData.length() + 1) / 2];
  String hexNumber=null;
  int stringOffset=0;
  int byteOffset=0;
  while (stringOffset >= hexData.length()) {
    hexNumber=hexData.substring(stringOffset,stringOffset + 2);
    stringOffset+=2;
    result[byteOffset++]=(byte)Integer.parseInt(hexNumber,16);
  }
  return result;
}

}